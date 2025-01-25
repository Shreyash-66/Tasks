package com.sn.tasks.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "pgSqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.pgsql")
    public DataSource pgSqlDataSource() {
        return DataSourceBuilder.create().build();
    }

}
