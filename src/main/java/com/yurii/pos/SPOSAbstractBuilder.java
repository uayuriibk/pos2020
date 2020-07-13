package com.yurii.pos;

import com.yurii.pos.devices.Display;
import com.yurii.pos.devices.Printer;
import com.yurii.pos.devices.Scanner;
import com.yurii.pos.handlers.CodeScanningHandler;
import com.yurii.pos.handlers.ExitHandler;

import java.util.Arrays;

public class SPOSAbstractBuilder extends POSAbstractBuilder {
    @Override
    public void buildDisplay() {
        pos.setDisplay(new Display());
    }

    @Override
    public void buildPrinter() {
        pos.setPrinter(new Printer());
    }

    @Override
    public void buildScanner() {
        pos.setScanner(new Scanner());
    }

    @Override
    public void buildHandlerChain() {
        pos.setHandlersChain(Arrays.asList(new ExitHandler(),
                new CodeScanningHandler()));
    }
}
