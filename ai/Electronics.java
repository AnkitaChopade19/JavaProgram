package com.ai;

class Electronics extends Product implements Discount {
    void getPrice() {
        System.out.println("Electronics Price: 30000");
    }

    public void applyDiscount() {
        System.out.println("Electronics Discount: 10%");
    }
}
