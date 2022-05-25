package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Foods;

public class Cheese extends Food {
    private String kindOfCheese;

    public Cheese(double quantity, String unitType, int price) {
        super(1, "decagram", 100);
    }

    public Cheese(double quantity, String unitType, int price, String kindOfCheese) {
        super(quantity, unitType, price);
        this.kindOfCheese = kindOfCheese;
    }

    public String getKindOfCheese() {
        return kindOfCheese;
    }

    public void setKindOfCheese(String kindOfCheese) {
        this.kindOfCheese = kindOfCheese;
    }
}
