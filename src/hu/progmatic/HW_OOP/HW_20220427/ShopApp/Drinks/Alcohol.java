package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Drinks;

public class Alcohol extends Drink {
    private String kindOfAlcohol;
    private double percent;

    public Alcohol(double quantity, String unitType, boolean isLongLife, int price) {
        super(1.0, "deciliter", false,250);
        this.percent = 0.5;
    }
    public Alcohol(double quantity, String unitType, boolean isLongLife, int price, String kindOfAlcohol, double percent) {
        super(quantity, unitType, isLongLife, price);
        this.kindOfAlcohol = kindOfAlcohol;
        this.percent = percent;
    }

    public Alcohol(double quantity, String unitType, boolean isLongLife, int price, double percent) {
        super(quantity, unitType, isLongLife, price);
        this.percent = percent;
    }

    public String getKindOfAlcohol() {
        return kindOfAlcohol;
    }

    public void setKindOfAlcohol(String kindOfAlcohol) {
        this.kindOfAlcohol = kindOfAlcohol;
    }
}
