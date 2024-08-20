package com.udemy.firstproject.udemyfirstproject;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person (String name, Integer age) {}
record Address (String street, String city, String state, String zip) {}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Vishal";
    }
    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person() {
        return new Person("Alok",32);
    }
    @Bean(name="address2")
    public Address address() {
        return new Address("Golf Street","Lucknow","Uttar Pradesh","262701");
    }


}
