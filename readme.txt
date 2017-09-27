1.本工程为spring4.3.9+springmvc+mybatis3.2.6+Oracle11G+Redis整合基础框架环境搭建
2.工程字符编码：utf-8
3.jdk版本：1.8
4.tomcat6/7
5.使用了阿里巴巴的Druid数据源
6.包含了mybatis分页配置
7.包含了redis缓存配置
8.启动工程用命令：clean tomcat7:run -Pdev
9.生成mybatis代码：mybatis-generator:generate
10.建表语句在文件夹sql下的T_TEST.sql
11.DBTest单元测试类完成了以下CRUD：
插入单条记录、批量插入数据、根据条件查询单条记录、根据条件查询集合数据、
根据条件删除指定记录、根据条件更新指定记录、根据条件批量更新记录
12.前端请求访问地址为：
http://localhost:8088/ssm/test/find
13.到此完成了ssm基础框架搭建，直接拿来用即可，在其基础上进行开发自己项目模块