package com.gzb.springboot.mvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringMvcGuide {

    @RequestMapping("/getModel")
    public MvcModel getMvcModel(){
        MvcModel mvcModel = new MvcModel();
        mvcModel.setModelName("小明");
        mvcModel.setModelType(1);
        return mvcModel;
    }

    @RequestMapping("/getStudent")
    public Student getStudent(){
        Student stu = new Student();
        stu.setName("小明");
        return stu;
    }

    public static void main(String[] args){
        SpringApplication.run(SpringMvcGuide.class,args);
    }


}
