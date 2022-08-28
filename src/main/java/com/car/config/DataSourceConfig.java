package com.car.config;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.hikari")
    public DataSource dataSource() {
        return new HikariDataSource();
    }

    @Bean
    public EntityManager entityManager(EntityManager entityManager) {
        return entityManager;
    }
}
