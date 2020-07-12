package com.yurii.pos.products;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class Price {
    @Getter
    private BigDecimal value;
    private Currency currency;

    public Price(BigDecimal value){
        this.value = value;
        this.currency = Currency.getInstance(Locale.US);
    }
}
