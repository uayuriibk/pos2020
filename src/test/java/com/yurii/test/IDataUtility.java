package com.yurii.test;

import com.yurii.pos.products.Price;
import com.yurii.pos.products.Product;

import java.math.BigDecimal;
import java.util.*;

public interface IDataUtility {

    default void getInfo(){
        System.out.println("IDataForTestUtility interface's default method has been called");
    }

    static Collection<Product> getProducts() {
        Collection<Product> products = new LinkedList<>();
        products.add(getProductA());
        products.add(getProductB());
        products.add(getProductC());
        products.add(getProductD());
        return products;
    }

    static Product getProductA() {
        return new Product ("A", "Apple", new Price(new BigDecimal(1.00)));
    }

    static Product getProductB() {
        return new Product ("B", "Banan", new Price(new BigDecimal(2.00)));
    }

    static Product getProductC() {
        return new Product ("C", "Cucumber", new Price(new BigDecimal(3.00)));
    }

    static Product getProductD() {
        return new Product ("D", "Dirol", new Price(new BigDecimal(4.00)));
    }

    static String[] splitToTheLetters(String source) {
        return source.split("");
    }
}
