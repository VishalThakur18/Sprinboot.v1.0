package com.udemy.firstproject.udemyfirstproject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {

    void eatApple(){
        System.out.println("Eating Apple");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct is being invoked before using Bean Apple");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destroy is being invoked before destroying Bean Apple");
    }
}
