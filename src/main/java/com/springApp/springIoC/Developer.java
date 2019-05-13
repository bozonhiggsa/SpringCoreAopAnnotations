package com.springApp.springIoC;

import lombok.Data;

/**
 Some entity class.
 @author Ihor Savchenko
 @version 1.0
 */
@Data
public class Developer {
    private String name;
    private String specialty;
    private Integer experience;

    public void someMethod(){
        System.out.println("Method from Developer class was carried out.");
    }

    public void throwSomeMysticException() throws BadPerformanceException{
        throw new BadPerformanceException("We have some strange and mystic exception here.");
    }
}
