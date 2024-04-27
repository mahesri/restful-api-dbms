## A REST API of DBMS implement Bootstrap

[Here](https://github.com/mahesri/restful-api-dbms?tab=readme-ov-file#over-view) for skip to the <b>over-view</b>.

This application build using [Spring Boot](https://spring.io/projects/spring-boot).

This application is implements:

1. `Spring-data-jpa` which allow us to configure this application with MySql.</br>
2. `Bootstrap` for makes every page more responsif.
3. `Thymeleaf` as a Java library to transform data from the server.

Learn more about Thymeleaf:
- [Thymeleaf-documentation](https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html)
- [Simple explanation Thymeleaf](https://github.com/dimMaryanto93/thymeleaf-example) in Bahasa.

## Additional

To run this application on host or our local computer, at least we need:

- JDK 17
- mysql

## Getting Started

Instead of running the application straight away, it would be better if we ensure a connection to the database first.

In `application.properties` as a default configure the connection to the database as follows: 

```
# JDBC driver SQL configuration
spring.datasource.url=jdbc:mysql://localhost:3306/newuserdb
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
```

The default schema of the `newuserdb` :

```
mysql> use newuserdb;
Database changed
mysql> desc user;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| id         | int         | NO   | PRI | NULL    | auto_increment |
| email      | varchar(45) | NO   | UNI | NULL    |                |
| first_name | varchar(45) | NO   |     | NULL    |                |
| last_name  | varchar(45) | NO   |     | NULL    |                |
| password   | varchar(15) | NO   |     | NULL    |                |
| enabled    | bit(1)      | NO   |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
6 rows in set (0.81 sec)
```


After database has conecting successfully, run the main class `src/main/java/DBMS/MydbmsApplication.java`

Open new tab on Your browser type `http://localhost:8080`.

## Over-view

This is a Rest Api for a DBMS built using Spring-Boot. This aplication provides operation such as Create, Read, Update, and Delete. These are the four basic operations used to manage data in to the MySql.

Building this application involves: Spring Boot Web, Spring Data JPA & Hibernate, MySQL Database, Thymeleaf, HTML5 & Bootstrap, JUnit 5 & AssertJ, Spring Data JPA Test. All steps in building this application can be followed [here](https://spring.io/guides/tutorials/rest).



