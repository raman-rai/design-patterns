package com.design.AbstractFactory;

public class Application {

    public static FurnitureFactory config(String productType){
        FurnitureFactory factory = null;
        if(productType == "Modern"){
            factory = new ModernFurnitureFactory();
        } else if(productType == "Traditional"){
            factory = new TraditionalFurnitureFactory();
        }
        return factory;
    }

    public static void setFurniture(String productType){
        FurnitureFactory factory = config(productType);
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createTable();
        chair.set();
        sofa.set();
        table.set();
    }

    public static void main(String[] args){
        String productType = "Modern";
        setFurniture(productType);
        productType = "Traditional";
        setFurniture(productType);
    }
}
