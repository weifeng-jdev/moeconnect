package com.amano.oauth.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Description
 * @ClassName DataSourceConfiguration
 * @Author 卫峰
 * @date 2022.03.29 16:46
 */
@RefreshScope
@Configuration
@Slf4j
public class DataSourceConfiguration {
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.max-active:10}")
    private Integer maxActive;
    @Value("${spring.datasource.initial-size:5}")
    private int initialSize;
    @Value("${spring.datasource.min-idle:5}")
    private int minIdle;
    @Value("${spring.datasource.max-wait:10000}")
    private int maxWait;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
