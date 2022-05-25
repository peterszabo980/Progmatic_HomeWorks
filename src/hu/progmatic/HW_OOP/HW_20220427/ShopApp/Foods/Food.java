package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Foods;

import hu.progmatic.HW_OOP.HW_20220427.ShopApp.Product;

public class Food extends Product {
    public Food(double quantity, String unitType, int price) {
        super(quantity, unitType, price);
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }


}

