//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package mondrian.olap;

import java.io.File;
import mondrian.olap.MondrianPropertiesBase.FilePropertySource;
import org.eigenbase.util.property.BooleanProperty;
import org.eigenbase.util.property.DoubleProperty;
import org.eigenbase.util.property.IntegerProperty;
import org.eigenbase.util.property.StringProperty;

public class MondrianProperties extends MondrianPropertiesBase {
    private static final MondrianProperties instance = new MondrianProperties();
    public final transient StringProperty AggregateRuleTag = new StringProperty(this, "mondrian.rolap.aggregates.rule.tag", "default");
    public final transient StringProperty AggregateRules = new StringProperty(this, "mondrian.rolap.aggregates.rules", "/DefaultRules.xml");
    public final transient StringProperty AlertNativeEvaluationUnsupported = new StringProperty(this, "mondrian.native.unsupported.alert", "OFF");
    public final transient BooleanProperty CaseSensitive = new BooleanProperty(this, "mondrian.olap.case.sensitive", false);
    public final transient StringProperty CatalogURL = new StringProperty(this, "mondrian.catalogURL", (String)null);
    public final transient IntegerProperty CellBatchSize = new IntegerProperty(this, "mondrian.rolap.cellBatchSize", -1);
    public final transient BooleanProperty ChooseAggregateByVolume = new BooleanProperty(this, "mondrian.rolap.aggregates.ChooseByVolume", false);
    public final transient BooleanProperty CompareSiblingsByOrderKey = new BooleanProperty(this, "mondrian.rolap.compareSiblingsByOrderKey", false);
    public final transient IntegerProperty CrossJoinOptimizerSize = new IntegerProperty(this, "mondrian.olap.fun.crossjoin.optimizer.size", 0);
    public final transient StringProperty DataSourceResolverClass = new StringProperty(this, "mondrian.spi.dataSourceResolverClass", (String)null);
    public final transient BooleanProperty DisableCaching = new BooleanProperty(this, "mondrian.rolap.star.disableCaching", false);
    public final transient BooleanProperty DisableLocalSegmentCache = new BooleanProperty(this, "mondrian.rolap.star.disableLocalSegmentCache", false);
    /** @deprecated */
    public final transient BooleanProperty EnableCacheHitCounters = new BooleanProperty(this, "mondrian.rolap.agg.enableCacheHitCounters", false);
    public final transient BooleanProperty EnableDrillThrough = new BooleanProperty(this, "mondrian.drillthrough.enable", true);
    public final transient BooleanProperty EnableExpCache = new BooleanProperty(this, "mondrian.expCache.enable", true);
    public final transient BooleanProperty EnableGroupingSets = new BooleanProperty(this, "mondrian.rolap.groupingsets.enable", false);
    public final transient BooleanProperty EnableInMemoryRollup = new BooleanProperty(this, "mondrian.rolap.EnableInMemoryRollup", true);
    public final transient BooleanProperty EnableNativeCrossJoin = new BooleanProperty(this, "mondrian.native.crossjoin.enable", true);
    public final transient BooleanProperty EnableNativeFilter = new BooleanProperty(this, "mondrian.native.filter.enable", true);
    public final transient BooleanProperty EnableNativeNonEmpty = new BooleanProperty(this, "mondrian.native.nonempty.enable", true);
    public final transient BooleanProperty EnableNativeTopCount = new BooleanProperty(this, "mondrian.native.topcount.enable", true);
    public final transient BooleanProperty EnableNonEmptyOnAllAxis = new BooleanProperty(this, "mondrian.rolap.nonempty", false);
    public final transient BooleanProperty EnableTotalCount = new BooleanProperty(this, "mondrian.xmla.drillthroughTotalCount.enable", true);
    public final transient BooleanProperty EnableTriggers = new BooleanProperty(this, "mondrian.olap.triggers.enable", true);
    public final transient IntegerProperty ExecutionHistorySize = new IntegerProperty(this, "mondrian.server.monitor.executionHistorySize", 1000);
    public final transient StringProperty ExpCompilerClass = new StringProperty(this, "mondrian.calc.ExpCompiler.class", (String)null);
    public final transient BooleanProperty ExpandNonNative = new BooleanProperty(this, "mondrian.native.ExpandNonNative", false);
    public final transient BooleanProperty FilterChildlessSnowflakeMembers = new BooleanProperty(this, "mondrian.rolap.FilterChildlessSnowflakeMembers", true);
    public final transient StringProperty FoodmartJdbcURL = new StringProperty(this, "mondrian.foodmart.jdbcURL", "jdbc:odbc:MondrianFoodMart");
    public final transient BooleanProperty GenerateAggregateSql = new BooleanProperty(this, "mondrian.rolap.aggregates.generateSql", false);
    public final transient BooleanProperty GenerateFormattedSql = new BooleanProperty(this, "mondrian.rolap.generate.formatted.sql", false);
    public final transient BooleanProperty IgnoreInvalidMembers = new BooleanProperty(this, "mondrian.rolap.ignoreInvalidMembers", false);
    public final transient BooleanProperty IgnoreInvalidMembersDuringQuery = new BooleanProperty(this, "mondrian.rolap.ignoreInvalidMembersDuringQuery", false);
    public final transient BooleanProperty IgnoreMeasureForNonJoiningDimension = new BooleanProperty(this, "mondrian.olap.agg.IgnoreMeasureForNonJoiningDimension", false);
    public final transient IntegerProperty IterationLimit = new IntegerProperty(this, "mondrian.rolap.iterationLimit", 0);
    public final transient IntegerProperty Iterations = new IntegerProperty(this, "mondrian.test.Iterations", 1);
    public final transient StringProperty JdbcDrivers = new StringProperty(this, "mondrian.jdbcDrivers", "sun.jdbc.odbc.JdbcOdbcDriver,org.hsqldb.jdbcDriver,oracle.jdbc.OracleDriver,com.mysql.jdbc.Driver");
    public final transient StringProperty JdbcFactoryClass = new StringProperty(this, "mondrian.rolap.aggregates.jdbcFactoryClass", (String)null);
    public final transient StringProperty LocalePropFile = new StringProperty(this, "mondrian.rolap.localePropFile", (String)null);
    public final transient IntegerProperty MaxConstraints = new IntegerProperty(this, "mondrian.rolap.maxConstraints", 1000);
    public final transient IntegerProperty MaxEvalDepth = new IntegerProperty(this, "mondrian.rolap.evaluate.MaxEvalDepth", 10);
    public final transient IntegerProperty MaxRows = new IntegerProperty(this, "mondrian.xmla.drillthroughMaxRows", 1000);
    public final transient BooleanProperty MemoryMonitor = new BooleanProperty(this, "mondrian.util.memoryMonitor.enable", false);
    public final transient StringProperty MemoryMonitorClass = new StringProperty(this, "mondrian.util.MemoryMonitor.class", (String)null);
    public final transient IntegerProperty MemoryMonitorThreshold = new IntegerProperty(this, "mondrian.util.memoryMonitor.percentage.threshold", 90);
    public final transient IntegerProperty NativizeMaxResults = new IntegerProperty(this, "mondrian.native.NativizeMaxResults", 150000);
    public final transient IntegerProperty NativizeMinThreshold = new IntegerProperty(this, "mondrian.native.NativizeMinThreshold", 100000);
    public final transient BooleanProperty NeedDimensionPrefix = new BooleanProperty(this, "mondrian.olap.elements.NeedDimensionPrefix", false);
    public final transient BooleanProperty NullDenominatorProducesNull = new BooleanProperty(this, "mondrian.olap.NullDenominatorProducesNull", false);
    public final transient StringProperty NullMemberRepresentation = new StringProperty(this, "mondrian.olap.NullMemberRepresentation", "#null");
    public final transient BooleanProperty OptimizePredicates = new BooleanProperty(this, "mondrian.rolap.aggregates.optimizePredicates", true);
    public final transient StringProperty PropertyValueMapFactoryClass = new StringProperty(this, "mondrian.rolap.RolapMember.PropertyValueMapFactory.class", (String)null);
    public final transient StringProperty QueryFileDirectory = new StringProperty(this, "mondrian.test.QueryFileDirectory", (String)null);
    public final transient StringProperty QueryFilePattern = new StringProperty(this, "mondrian.test.QueryFilePattern", (String)null);
    public final transient IntegerProperty QueryLimit = new IntegerProperty(this, "mondrian.query.limit", 40);
    public final transient IntegerProperty QueryTimeout = new IntegerProperty(this, "mondrian.rolap.queryTimeout", 0);
    public final transient BooleanProperty ReadAggregates = new BooleanProperty(this, "mondrian.rolap.aggregates.Read", false);
    public final transient IntegerProperty ResultLimit = new IntegerProperty(this, "mondrian.result.limit", 0);
    public final transient IntegerProperty RolapConnectionShepherdNbThreads = new IntegerProperty(this, "mondrian.rolap.maxQueryThreads", 20);
    public final transient StringProperty RolapConnectionShepherdThreadPollingInterval = new StringProperty(this, "mondrian.rolap.shepherdThreadPollingInterval", "1000ms");
    public final transient StringProperty SegmentCache = new StringProperty(this, "mondrian.rolap.SegmentCache", (String)null);
    public final transient IntegerProperty SegmentCacheManagerNumberCacheThreads = new IntegerProperty(this, "mondrian.rolap.maxCacheThreads", 100);
    public final transient IntegerProperty SegmentCacheManagerNumberSqlThreads = new IntegerProperty(this, "mondrian.rolap.maxSqlThreads", 100);
    public final transient StringProperty SolveOrderMode = new StringProperty(this, "mondrian.rolap.SolveOrderMode", "ABSOLUTE");
    public final transient IntegerProperty SparseSegmentCountThreshold = new IntegerProperty(this, "mondrian.rolap.SparseSegmentValueThreshold", 1000);
    public final transient DoubleProperty SparseSegmentDensityThreshold = new DoubleProperty(this, "mondrian.rolap.SparseSegmentDensityThreshold", 0.5D);
    public final transient StringProperty SqlMemberSourceValuePoolFactoryClass = new StringProperty(this, "mondrian.rolap.SqlMemberSource.ValuePoolFactory.class", (String)null);
    public final transient StringProperty StatisticsProviders = new StringProperty(this, "mondrian.statistics.providers", (String)null);
    public final transient StringProperty TestClass = new StringProperty(this, "mondrian.test.Class", (String)null);
    public final transient StringProperty TestConnectString = new StringProperty(this, "mondrian.test.connectString", (String)null);
    public final transient IntegerProperty TestExpDependencies = new IntegerProperty(this, "mondrian.test.ExpDependencies", 0);
    public final transient StringProperty TestHighCardinalityDimensionList = new StringProperty(this, "mondrian.test.highCardDimensions", (String)null);
    public final transient StringProperty TestJdbcPassword = new StringProperty(this, "mondrian.foodmart.jdbcPassword", (String)null);
    public final transient StringProperty TestJdbcUser = new StringProperty(this, "mondrian.foodmart.jdbcUser", (String)null);
    public final transient StringProperty TestName = new StringProperty(this, "mondrian.test.Name", (String)null);
    public final transient IntegerProperty TestSeed = new IntegerProperty(this, "mondrian.test.random.seed", 1234);
    public final transient IntegerProperty TimeLimit = new IntegerProperty(this, "mondrian.test.TimeLimit", 0);
    public final transient BooleanProperty UseAggregates = new BooleanProperty(this, "mondrian.rolap.aggregates.Use", false);
    public final transient IntegerProperty VUsers = new IntegerProperty(this, "mondrian.test.VUsers", 1);
    public final transient StringProperty VfsClass = new StringProperty(this, "mondrian.spi.virtualFileHandlerClass", (String)null);
    public final transient BooleanProperty Warmup = new BooleanProperty(this, "mondrian.test.Warmup", false);
    public final transient StringProperty WarnIfNoPatternForDialect = new StringProperty(this, "mondrian.test.WarnIfNoPatternForDialect", "NONE");
    public final transient StringProperty XmlaSchemaRefreshInterval = new StringProperty(this, "mondrian.xmla.SchemaRefreshInterval", "3000ms");

    private MondrianProperties() {
        super(new FilePropertySource(new File("mondrian.properties")));
        this.populate();
    }

    public static MondrianProperties instance() {
        return instance;
    }
}
