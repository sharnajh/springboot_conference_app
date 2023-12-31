package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Value("${MYSQL_PASSWORD}")
    private String mysqlPassword;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/conference_demo");
        builder.username("root");
        builder.password(mysqlPassword);
        System.out.println("My custom datasource bean has been initialized + set.");
        return builder.build();
    }
}
