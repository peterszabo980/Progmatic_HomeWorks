package hu.progmatic.HW_OOP.HW_20220413.Extra_beugro.models;

public class Buyer {
    private double money;
    private String name;

    public Buyer(double penz, String nev) {
        this.money = penz;
        this.name = nev;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        String moneyString = String.format("%.2f", money);

        return "Ennyi pénzed van: " + moneyString;
    }
}
