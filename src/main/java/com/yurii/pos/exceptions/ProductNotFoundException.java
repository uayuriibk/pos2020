package com.yurii.pos.exceptions;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message){
        super(message);
    }
}
