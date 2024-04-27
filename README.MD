## A REST API of DBMS implement Bootstrap

This app build using [Spring Boot](https://spring.io/projects/spring-boot).

This application is implements:

1. `Spring-data-jpa` which allow us to configure this application with MySql.</br>
2. `Bootstrap` for makes every page more responsif.
3. `Thymeleaf` as a Java library to transform data from the server.

Learn more about Thymeleaf:
- [Thymeleaf-documentation](https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html)
- [Simple explanation Thymeleaf](https://github.com/dimMaryanto93/thymeleaf-example) in Bahasa.

To run this application on host or our local computer, at least we need:

- JDK 17
- mysql

## Getting Started

Instead of running the application straight away, it would be better if we ensure a connection to the database first.

In `application.properties` as a default 

```
# JDBC driver SQL configuration
spring.datasource.url=jdbc:mysql://localhost:3306/newuserdb
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
```

You need to run the main class

Open new tab on Your browser type `http://localhost:8080` You will probably see a results like at the photo below.

