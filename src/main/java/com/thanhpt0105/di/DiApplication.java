package com.thanhpt0105.di;

import com.thanhpt0105.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DiApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");

        String test = myController.testExample();
        System.out.println("test");
    }

}
