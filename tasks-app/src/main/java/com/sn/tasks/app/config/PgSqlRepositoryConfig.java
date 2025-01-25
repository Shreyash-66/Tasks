package com.sn.tasks.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.sn.tasks.app.pgsql.repository",
        entityManagerFactoryRef = "pgSqlEntityManagerFactory",
        transactionManagerRef = "pgSqlTransactionManager"
)
public class PgSqlRepositoryConfig {
}
