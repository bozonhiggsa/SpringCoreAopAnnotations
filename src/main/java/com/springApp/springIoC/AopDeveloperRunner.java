package com.springApp.springIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 Entry point
 @author Ihor Savchenko
 @version 1.0
 */
public class AopDeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop-developer-annotations-config.xml");
        System.out.println("Spring context was created");

        Developer developer = (Developer) context.getBean("developer");

        System.out.println(developer);

        developer.throwSomeMysticException();
    }
}
