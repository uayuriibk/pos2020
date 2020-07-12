package com.yurii.pos.products;

import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class ProductsInfoDB implements IProductsInfoDB {

    private Map<String, Product> productsCodesMap = new HashMap<>();

    public ProductsInfoDB(Collection<Product> products){
        products.forEach((product) ->
                productsCodesMap.put(product.getCode(), product));
    }

    @Override
    public void addProduct(Product product) {
        productsCodesMap.put(product.getCode(), product);
    }

    @Override
    public void deleteProductByCode(String productCode) {
        productsCodesMap.remove(productCode);
    }

    @Override
    public Price getProductPriceByCode(String productCode) {
        return productsCodesMap.get(productCode).getPrice();
    }

    @Override
    public String getProductTitle(String productCode) {
        return productsCodesMap.get(productCode).getTitle();
    }

    @Override
    public boolean isPresentInStorage(String productCode) {
        return productsCodesMap.containsKey(productCode) ? true : false;
    }
}
