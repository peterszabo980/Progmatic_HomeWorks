package hu.progmatic.HW_OOP_20220413.Beugro.models;

public class Presenter {
    private String name;
    private String country;
    private int formationDate;

    public Presenter() {
    }

    public Presenter(String name, String country, int formationDate) {
        this.name = name;
        this.country = country;
        this.formationDate = formationDate;
    }

    public void printInfo() {
        System.out.println("Név:\t\t\t" + name);
        System.out.println("Származás:\t\t" + country);
        System.out.println("Együttes megalakulásának éve:\t" + formationDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(int formationDate) {
        this.formationDate = formationDate;
    }
}
