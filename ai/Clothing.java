package com.ai;

class Clothing extends Product implements Discount {
    void getPrice() {
        System.out.println("Clothing Price: 2000");
    }

    public void applyDiscount() {
        System.out.println("Clothing Discount: 20%");
    }
}
