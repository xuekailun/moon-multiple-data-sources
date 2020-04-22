package com.moon.moonmultipledatasources;

import com.moon.config.db.FirstDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages =  "com.moon")
public class MoonMultipleDataSourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoonMultipleDataSourcesApplication.class, args);
    }

}
