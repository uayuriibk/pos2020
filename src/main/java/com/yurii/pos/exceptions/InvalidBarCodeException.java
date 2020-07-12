package com.yurii.pos.exceptions;

public class InvalidBarCodeException extends Exception {
    public InvalidBarCodeException(String message){
        super(message);
    }
}
