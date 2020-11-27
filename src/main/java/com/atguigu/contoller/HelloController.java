package com.atguigu.contoller;

import com.atguigu.properties.DataSourceProperties4;
import com.atguigu.properties.DataSourceProperties2;
import com.atguigu.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
//@EnableConfigurationProperties(DataSourceProperties2.class)
@EnableConfigurationProperties({JdbcProperties.class})
public class HelloController {

    @Autowired
    private DataSourceProperties4 dataSourceProperties;

    @Autowired
    private DataSourceProperties2 dataSourceProperties2;

    @Autowired
    private JdbcProperties jdbcProperties;

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    public String hello(){
        //System.out.println("dataSourceProperties = " + dataSourceProperties);
        //System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
        //System.out.println("jdbcProperties = " + jdbcProperties);
        //System.out.println(jdbcProperties.getDataSource());
        System.out.println(dataSource.getClass());
        return "hello spring boot!!!!";
    }
}
