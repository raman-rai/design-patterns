package com.design.Factory;

public class Application {

    public static Factory config(char productType){
        Factory factory = null;
        if(productType == 'A'){
            factory = new FactoryA();
        } else if(productType == 'B') {
            factory = new FactoryB();
        }
        return factory;
    }

    public static void work(char productType){
        Factory factory = null;
        factory = config(productType);
        Product product = factory.createProduct();
        product.work();
    }

    public static void main(String[] args){
        char productType = 'A';
        work(productType);
        productType = 'B';
        work(productType);
    }
}
