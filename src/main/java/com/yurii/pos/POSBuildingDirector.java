package com.yurii.pos;

import lombok.Getter;
import lombok.Setter;

public class POSBuildingDirector {
    @Getter @Setter
    private POSAbstractBuilder posAbstractBuilder;

    public void constructPOS(){
        posAbstractBuilder.createNewPOS();
        posAbstractBuilder.buildScanner();
        posAbstractBuilder.buildDisplay();
        posAbstractBuilder.buildPrinter();
        posAbstractBuilder.buildHandlerChain();
    }
}
