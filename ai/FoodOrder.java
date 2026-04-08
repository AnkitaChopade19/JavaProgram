package com.ai;

public abstract class FoodOrder {
	
	/*9. Food Delivery System (Abstract Class)
Abstract class FoodOrder:
abstract method prepareFood()
concrete method orderDetails()
Subclasses:
VegOrder
NonVegOrder  */
	
	abstract void prepareFood();
	
	void orderDetails() {
        System.out.println("Order placed successfully");
    }
}
	

