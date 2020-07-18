package com.yurii.pos.devices;

import com.yurii.pos.exceptions.InvalidBarCodeException;
import com.yurii.pos.exceptions.ProductNotFoundException;
import com.yurii.pos.products.IProductsInfoDB;

import java.math.BigDecimal;
import java.util.Map;

public interface IScanner {
    void scanCode(String code) throws ProductNotFoundException, InvalidBarCodeException;
    Map<String, String> getReceipt();
    BigDecimal calculateTotalPrice();
    void setProductsInfoDB(IProductsInfoDB productsData);
    void clearScanned();
}
