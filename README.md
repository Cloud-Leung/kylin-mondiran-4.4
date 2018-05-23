kylin Mondrian
==
整合了一些适配kylin的方式，做了一些改动

1.Mondrian基于4.4版本源码<br>
2.在项目中增加了对kylin数据源的支持，参考了该开源项目kylin-mondrian-interaction<br>
3.由于kylin的语法的UPPER函数只支持对表字段使用，而不支持对值使用，但mondrian会对值也加上upper函数，<br>
&nbsp;&nbsp;&nbsp;所以对kylin的方言做了一些改动，适配kylin的语法。<br>
3.Mondrian初始只支持inner join，如果kylin的模型配置了left join，查询则会失败，参考开源项目mondrian-join-support做了修改。

Home page: http://mondrian.pentaho.com
Project home: http://sourceforge.net/projects/mondrian/
Email: jhyde@pentaho.com
