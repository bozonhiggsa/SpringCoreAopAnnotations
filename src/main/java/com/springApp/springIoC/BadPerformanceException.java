package com.springApp.springIoC;

/**
 * Class with special particular exception
 * @author Ihor Savchenko
 * @version 1.0
 */
public class BadPerformanceException extends Exception {

    public BadPerformanceException(String message) {
        super(message);
    }
}
