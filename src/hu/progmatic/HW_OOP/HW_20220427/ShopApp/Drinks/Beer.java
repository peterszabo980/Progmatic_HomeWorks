package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Drinks;

public class Beer extends Alcohol {
    private String kindOfBeer;

    public Beer(double quantity, String unitType, boolean isLongLife, int price, double percent) {
        super(1, "deciliter", false, 250, 0.5);
    }
    public Beer(double quantity, String unitType, boolean isLongLife, int price, String kindOfBeer) {
        super(quantity, unitType, isLongLife, price);
        this.kindOfBeer = kindOfBeer;
    }
}
