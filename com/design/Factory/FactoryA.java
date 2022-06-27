package com.design.Factory;

public class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
