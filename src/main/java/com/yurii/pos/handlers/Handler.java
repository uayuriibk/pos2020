package com.yurii.pos.handlers;

public interface Handler {
    void setNext(Handler nextInChain);
    void process(String input);
}
