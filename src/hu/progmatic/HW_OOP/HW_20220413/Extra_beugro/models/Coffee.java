package hu.progmatic.HW_OOP.HW_20220413.Extra_beugro.models;

public class Coffee {

    private String name;
    private double price;
    private int amount;

    public Coffee(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInfo() {
        String priceString = String.format("%.2f", price);

        return name + " - ára: " + priceString + " (elérhető: " + amount + " db.)";
    }
}
