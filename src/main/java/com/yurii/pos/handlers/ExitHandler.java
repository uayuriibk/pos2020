package com.yurii.pos.handlers;

import com.yurii.pos.POS;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class ExitHandler implements Handler {

    private Handler nextInChainHandler;

    @Override
    public void setNext(Handler nextInChain) {
        this.nextInChainHandler = nextInChain;
    }

    @Override
    public void process(String input) {
        if((StringUtils.isNotBlank(input))&&(input.equals("exit"))){
            Map<String, String> receipt = POS.getInstance().getScanner().getReceipt();
            String boughtProducts = receipt.get("boughtProducts");
            String totalPriceInReceipt = receipt.get("totalPrice");

            POS.getInstance().getDisplay().displayMessage(boughtProducts + totalPriceInReceipt);
            POS.getInstance().getPrinter().printMessage(totalPriceInReceipt);
        } else {
            nextInChainHandler.process(input);
        }
    }
}
