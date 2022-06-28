package com.design.AbstractFactory;

public class TraditionalFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new TraditionalChair();
    }

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa();
    }

    @Override
    public Table createTable() {
        return new TraditionalTable();
    }
}
