package com.udemy.firstproject.udemyfirstproject;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class App02HelloWorldSpring implements CommandLineRunner {

    @Autowired
    Apple obj;
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        SpringApplication.run(App02HelloWorldSpring.class, args);

    }



    @Override
    public void run(String... args) throws Exception {
        obj.eatApple();
    }
}
