package com.atguigu.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.jdbc")
public class JdbcProperties {
    private DataSourceProperties3 dataSource;//注意属性名称
    private String type;

    public DataSourceProperties3 getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSourceProperties3 dataSource) {
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
