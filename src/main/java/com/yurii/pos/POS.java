package com.yurii.pos;

import com.yurii.pos.devices.IDisplay;
import com.yurii.pos.devices.IPrinter;
import com.yurii.pos.devices.IScanner;
import com.yurii.pos.handlers.Handler;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.IntStream;

public class POS implements IPOS {

    private final static POS instance = new POS();

    @Setter @Getter
    private IDisplay display;

    @Setter @Getter
    private IPrinter printer;

    @Setter @Getter
    private IScanner scanner;

    @Setter
    private List<Handler> handlersList;

    private POS(){}

    private void setNextHandlersInChain(List<Handler> handlers){
        IntStream.range(0, handlers.size()).forEach(
                index -> handlers.get(index).setNext(handlers.get(++index))
        );
    }

    public static synchronized POS getInstance(){ return instance; }

    public void setHandlersChain(List<Handler> handlers){
        this.handlersList = handlers;
        setNextHandlersInChain(handlersList);
    }

    @Override
    public void processInput(String input) {
        handlersList.get(0).process(input);
    }
}
