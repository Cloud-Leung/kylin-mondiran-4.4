package mondrian.spi.impl;

import mondrian.rolap.SqlStatement;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * kylin只支持对字段使用UPPER函数，而不支持对传入的参数使用UPPER函数
 * Created by liang.q on 2018/2/9.
 */
public class KylinDialect extends JdbcDialectImpl {

    private static final Map<Integer, SqlStatement.Type> DEFAULT_TYPE_MAP;
    private static final Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
    public static final JdbcDialectFactory FACTORY;

    public KylinDialect(Connection connection) throws SQLException {
        super(connection);
    }

    @Override
    public boolean allowsCountDistinct() {
        return false;
    }

    @Override
    public boolean allowsJoinOn() {
        return true;
    }

    static {
        Map<Integer, SqlStatement.Type> typeMapInitial = new HashMap<Integer, SqlStatement.Type>();
        typeMapInitial.put(Types.SMALLINT, SqlStatement.Type.INT);
        typeMapInitial.put(Types.INTEGER, SqlStatement.Type.INT);
        typeMapInitial.put(Types.BOOLEAN, SqlStatement.Type.INT);
        typeMapInitial.put(Types.DOUBLE, SqlStatement.Type.DOUBLE);
        typeMapInitial.put(Types.FLOAT, SqlStatement.Type.DOUBLE);
        typeMapInitial.put(Types.BIGINT, SqlStatement.Type.LONG);
        DEFAULT_TYPE_MAP = Collections.unmodifiableMap(typeMapInitial);

        FACTORY = new JdbcDialectFactory(KylinDialect.class, DatabaseProduct.KYLIN) {
            @Override
            protected boolean acceptsConnection(Connection connection) {
                return super.acceptsConnection(connection);
            }
        };
    }

    @Override
    public SqlStatement.Type getType(ResultSetMetaData metaData, int columnIndex) throws SQLException {
        int columnType = metaData.getColumnType(columnIndex + 1);
        SqlStatement.Type internalType;
        if (columnType != 2 && columnType != 3) {
            internalType = DEFAULT_TYPE_MAP.get(columnType);
        } else {
            int precision = metaData.getPrecision(columnIndex + 1);
            int scale = metaData.getScale(columnIndex + 1);
            if (scale == 0 && precision <= 9) {
                internalType = SqlStatement.Type.INT;
            } else {
                internalType = SqlStatement.Type.DOUBLE;
            }
        }

        internalType = internalType == null ? SqlStatement.Type.OBJECT : internalType;
        this.logTypeInfo(metaData, columnIndex, internalType);
        return internalType;
    }

    @Override
    public String toUpper(String expr) {
        // kylin只支持对字段使用UPPER函数，而不支持对传入的参数使用UPPER函数
        if (null == expr || isContainChinese(expr)) {
            return null == expr ? null : expr.toUpperCase();
        }
        if (expr.contains(".")) {
            return "UPPER(" + expr + ")";
        }
        return expr.toUpperCase();
    }

    private boolean isContainChinese(String str) {
        Matcher m = p.matcher(str);
        return m.find();
    }
}
