package pl.kmiecik.jdbc;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfig {


    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://remotemysql.com:3306/yIqoXdM9OI");
        dataSourceBuilder.username("yIqoXdM9OI");
        dataSourceBuilder.password("DslCDdzS3u");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTemplate getJdbcApplication(){
        return new JdbcTemplate(getDataSource());
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        String sql="CREATE TABLE videos(video_id int, title varchar(255),url varchar(255),PRIMARY KEY (video_id)) ";
        getJdbcApplication().update(sql);
    }

}
