package com.driver;

public class InsufficientBalanceException extends RuntimeException{

    InsufficientBalanceException(){
        super("Insufficient Balance");
    }

}
