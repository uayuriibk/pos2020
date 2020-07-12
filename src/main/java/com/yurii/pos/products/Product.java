package com.yurii.pos.products;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Product {
    @Getter
    private String code;
    @Getter
    private String title;
    @Getter
    private Price price;
}
