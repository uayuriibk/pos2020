package com.yurii.pos;

import lombok.Getter;

public  abstract class POSAbstractBuilder {

    @Getter
    protected  POS pos;

    public void createNewPOS(){
        this.pos = POS.getInstance();
    }

    public abstract void buildDisplay();
    public abstract void buildPrinter();
    public abstract void buildScanner();
    public abstract void buildHandlerChain();
}
