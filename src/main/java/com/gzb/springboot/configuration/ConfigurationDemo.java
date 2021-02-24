package com.gzb.springboot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.gzb.springboot")
public class ConfigurationDemo {

    @Value("${book.name}")
    private String bookName;

    @Value("${file.upload}")
    private String filePath;

    @Value("${myconfig.import.name}")
    private String importConfig;

    @Value("${spring.app.descript}")
    private String descript;

    @Value("${rand.uuid}")
    private String randomValue;

    @Valid
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/config")
    public String config(){
        return bookName;
    }

    @RequestMapping("/upload")
    public String upload(){
        return filePath;
    }

    @RequestMapping("/import")
    public String importConfig(){
        return importConfig;
    }

    @RequestMapping("/descript")
    public String getDescript(){
        return descript;
    }

    @RequestMapping("/random")
    public String getRandom(){
        return randomValue;
    }

    @RequestMapping("/datasource")
    public String getDataSourceUrl(){
        return dataSource.getUrl() + "/" + dataSource.getUsername();
    }



    public static void main(String[] args){
        SpringApplication.run(ConfigurationDemo.class,args);
    }

}
