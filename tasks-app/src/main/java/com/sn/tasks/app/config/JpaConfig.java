package com.sn.tasks.app.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class JpaConfig {

    @Bean(name = "pgSqlEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory (
            EntityManagerFactoryBuilder builder,
            @Qualifier("pgSqlDataSource")DataSource dataSource
            ) {
        return builder.dataSource(dataSource)
                .packages("com.sn.tasks.app.pgsql.model")
                .persistenceUnit("postgres")
                .build();
    }

    @Bean(name = "pgSqlTransactionManager")
    public PlatformTransactionManager postgresTransactionManager (
            @Qualifier("pgSqlEntityManagerFactory")EntityManagerFactory factory
            ) {
        return new JpaTransactionManager(factory);
    }
}
