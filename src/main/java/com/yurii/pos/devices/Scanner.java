package com.yurii.pos.devices;

import com.yurii.pos.exceptions.InvalidBarCodeException;
import com.yurii.pos.exceptions.ProductNotFoundException;
import com.yurii.pos.products.IProductsInfoDB;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Scanner implements IScanner {

    @Setter
    private IProductsInfoDB productsInfoDB;

    private List<String> shoppingCart = new ArrayList<>();

    @Override
    public void scanCode(String code) throws ProductNotFoundException, InvalidBarCodeException {
        if (code.isBlank()){
            throw new InvalidBarCodeException("Invalid bar-code");
        } else if (!productsInfoDB.isPresentInStorage(code)){
            throw new ProductNotFoundException("Product not found");
        } else {
            shoppingCart.add(code);
        }
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return shoppingCart.stream().map((code) -> productsInfoDB.getProductPriceByCode(code).getValue())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Map<String, String> getReceipt() {
        return null;
    }

    @Override
    public void clearScanned() {
        shoppingCart.clear();
    }
}
