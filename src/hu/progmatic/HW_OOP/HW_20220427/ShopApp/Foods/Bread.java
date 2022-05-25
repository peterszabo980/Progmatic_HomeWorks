package hu.progmatic.HW_OOP.HW_20220427.ShopApp.Foods;

public class Bread extends Food {
    private String kindOfBread;

    public Bread() {
        super(1.0, "kilo", 350);
        this.kindOfBread = kindOfBread;
    }

    public String getComposition() {
        return kindOfBread;
    }

    public void setComposition(String composition) {
        this.kindOfBread = composition;
    }



}
