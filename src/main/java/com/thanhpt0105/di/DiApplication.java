package com.thanhpt0105.di;

import com.thanhpt0105.di.controllers.*;
import com.thanhpt0105.di.examplebeans.FakeDataSource;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan() in case the bean is not in the default package of Spring
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DiApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getDburl());
    }

}
