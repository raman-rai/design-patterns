package com.design.Factory;

public class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
