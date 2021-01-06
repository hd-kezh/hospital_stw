package com.stw.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * sqlserver����Դ����
 */
@Configuration
public class DataSourceConfig {

    @ConditionalOnProperty(prefix = "spring.datasource.sqlserver")
    public DataSource sqlserverDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * ��sqlserver��������mysql����
     * @return
     */
    @ConditionalOnProperty(prefix = "spring.datasource.mysql")
    public DataSource mysqlDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

}
