package com.springApp.springIoC;

import org.aspectj.lang.annotation.*;

/**
 Class with methods that use as advices.
 @author Ihor Savchenko
 @version 1.0
 */
@Aspect
public class Logging {

    @Pointcut("execution(* com.springApp.springIoC.Developer.*(..))")
    public void selectAllMethodsAvaliable() {
    }

    @Before("selectAllMethodsAvaliable()")
    public void adviceBeforeMethod() {
        System.out.println("Now we are going to initialize developer's profile.");
    }

    @After("selectAllMethodsAvaliable()")
    public void adviceAfterMethod() {
        System.out.println("Developer's profile has been initialized.");
    }

    @AfterReturning(pointcut = "selectAllMethodsAvaliable()", returning = "someValue")
    public void adviceAfterReturningValue(Object someValue) {
        if(someValue != null){
            System.out.println("Value: " + someValue.toString());
        }
        else{
            System.out.println("Method didn't return any value.");
        }
    }

    @AfterThrowing(pointcut = "selectAllMethodsAvaliable()", throwing = "e")
    public void adviceInCaseOfExceptionThrow(BadPerformanceException e) {
        System.out.println("We have an exception here: " + e.toString());
    }

}
