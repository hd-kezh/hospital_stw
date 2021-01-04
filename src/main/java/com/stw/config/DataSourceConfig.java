package com.stw.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * sqlserver数据源配置
 */
@Configuration
public class DataSourceConfig {

    @ConditionalOnProperty(prefix = "spring.datasource.sqlserver")
    public DataSource sqlserverDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 无sqlserver环境下用mysql测试
     * @return
     */
    @ConditionalOnProperty(prefix = "spring.datasource.mysql")
    public DataSource mysqlDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

}
