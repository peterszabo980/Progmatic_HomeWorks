package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Drinks;

import hu.progmatic.HW_OOP.HW_20220427.ShopApp.Product;

public class Drink extends Product {
    private String kindOfDrink;

    public Drink(double quantity, String unitType, boolean isLongLife, int price) {
        super(quantity, unitType, isLongLife, price);
        this.kindOfDrink = kindOfDrink;
    }

    public Drink(double quantity, String unitType, int price) {
        super(quantity, unitType, price);
    }

    public String getKindOfDrink() {
        return kindOfDrink;
    }

    public void setKindOfDrink(String kindOfDrink) {
        this.kindOfDrink = kindOfDrink;
    }
}
