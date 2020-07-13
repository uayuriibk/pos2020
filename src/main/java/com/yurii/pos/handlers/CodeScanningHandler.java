package com.yurii.pos.handlers;

import com.yurii.pos.POS;
import com.yurii.pos.exceptions.InvalidBarCodeException;
import com.yurii.pos.exceptions.ProductNotFoundException;

public class CodeScanningHandler implements Handler {

    private Handler nextInChainHandler;

    @Override
    public void setNext(Handler nextInChain) {
        this.nextInChainHandler = nextInChain;
    }

    @Override
    public void process(String input) {
        try {
            POS.getInstance().getScanner().scanCode(input);
        } catch (ProductNotFoundException pnfe){
            POS.getInstance().getDisplay().displayMessage(pnfe.getMessage());
        } catch (InvalidBarCodeException ibce){
            POS.getInstance().getDisplay().displayMessage(ibce.getMessage());
        }
    }
}
