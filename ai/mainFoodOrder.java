package com.ai;

public class mainFoodOrder {
    public static void main(String[] args) {
        VegOrder v = new VegOrder();
        v.orderDetails();
        v.prepareFood();

        NonVegOrder n = new NonVegOrder();
        n.orderDetails();
        n.prepareFood();
    }
}
