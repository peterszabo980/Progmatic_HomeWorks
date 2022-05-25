package hu.progmatic.HW_OOP.HW_20220427.ShopApp;

public class Product {
    protected double quantity;
    protected String unitType;
    protected boolean isLongLife;
    protected int price;

    public Product(double quantity, String unitType, int price) {
    }

    public Product(double quantity, String unitType, boolean isLongLife, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.isLongLife = isLongLife;
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public boolean isLongLife() {
        return isLongLife;
    }

    public void setLongLife(boolean longLife) {
        isLongLife = longLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
