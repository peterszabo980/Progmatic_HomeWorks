package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Foods;

import hu.progmatic.HW_OOP.HW_20220427.ShopApp.Drinks.Drink;

public class Juice extends Drink {
    private String kindOfJuice;

    public Juice() {
        super(1.0, "deciliter", false, 150);
        this.kindOfJuice = kindOfJuice;
    }

    public Juice(double quantity, String unitType, boolean isLongLife, int price, String kindOfJuice) {
        super(quantity, unitType, isLongLife, price);
        this.kindOfJuice = kindOfJuice;
    }

    public String getKindOfJuice() {
        return kindOfJuice;
    }

    public void setKindOfJuice(String kindOfJuice) {
        this.kindOfJuice = kindOfJuice;
    }
}
