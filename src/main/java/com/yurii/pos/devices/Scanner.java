package com.yurii.pos.devices;

import com.yurii.pos.exceptions.InvalidBarCodeException;
import com.yurii.pos.exceptions.ProductNotFoundException;

import java.math.BigDecimal;
import java.util.Map;

public class Scanner implements IScanner {
    @Override
    public void scanCode(String code) throws ProductNotFoundException, InvalidBarCodeException {

    }

    @Override
    public Map<String, String> getReceipt() {
        return null;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return null;
    }

    @Override
    public void clearScanned() {

    }
}
