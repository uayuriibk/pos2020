package com.yurii.pos.products;

public interface IProductsInfoDB {
    void addProduct(Product product);
    void deleteProductByCode(String productCode);
    Price getProductPriceByCode(String productCode);
    String getProductTitle(String productCode);
    boolean isPresentInStorage(String productCode);
}
