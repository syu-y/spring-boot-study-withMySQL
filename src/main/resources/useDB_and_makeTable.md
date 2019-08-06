# DB setUp
## Enveiromental
+ centOS
+ mySQL
+ Eclipse Che
+ maven
+ spring-boot

## Start to use DB
Right click db and select terminal.
You input " mysql -u root -p "  and input " password " as password
Soon mysql will start, then, you input " show databasea; "
Last, You have to select DB using commmand ( use <DBname>; ).
If "Database changed" is displayed, you finished work in this step.

## Make Sample table
You need to make a sample table.
First, you should write next command to defined a table schema.

'''
CREATE TABLE IF NOT EXISTS employee(
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    age INT
);
'''

Next, you input date to above table.

'''
INSERT INTO employee(employee_id, employee_name, age) VALUES (1, 'yamadatarou', 30);
INSERT INTO employee(employee_id, employee_name, age) VALUES (2, 'nakajimayuuya', 25);
INSERT INTO employee(employee_id, employee_name, age) VALUES (3, 'akiyamakousuke', 34);
'''

In this step, you have to do these works.

## Write properties
You have to write some properties for connecting to DB in you-project.
You write below dependencies in pom.xml.

'''
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
    
<dependency>
    <groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
'''

Last, you write next properties in application.properties file.

'''
spring.datasource.url=jdbc:mysql://xxx.xxx.xxx.xxx:<port>/<DBname>?useSSL=false
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.database=MYSQL
spring.jpa.hibernate.ddl-auto=update
'''

Let's use DB in spring-boot!!!