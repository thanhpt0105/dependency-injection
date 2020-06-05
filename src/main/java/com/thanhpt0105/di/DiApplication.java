package com.thanhpt0105.di;

import com.thanhpt0105.di.controllers.ConstructorInjectedController;
import com.thanhpt0105.di.controllers.MyController;
import com.thanhpt0105.di.controllers.PropertyInjectedController;
import com.thanhpt0105.di.controllers.SetterInjectedController;
import jdk.nashorn.internal.objects.annotations.Setter;
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


        //Add annotation @Controller and @Service to the controllers and service so Spring knows them as beans and initiate
        //Add @Autowired for service declaration in property and setter Injection controller so Spring knows to inject the service.
        //Constructor injection controller doesn't need to use Autowire annotation.
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");

        System.out.println(propertyInjectedController.getGreeting());
        System.out.println(setterInjectedController.getGreeting());
        System.out.println(constructorInjectedController.getGreeting());
    }

}
