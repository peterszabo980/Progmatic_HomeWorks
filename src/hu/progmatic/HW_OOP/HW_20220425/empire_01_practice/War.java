package hu.progmatic.HW_OOP.HW_20220425.empire_01_practice;

public class War {
    private String name;
    private String country1, country2;

    public War() {
    }

    public War(String name, String country1, String country2) {
        this.name = name;
        this.country1 = country1;
        this.country2 = country2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

   /* public static boolean isCivilWar() {
        return (country1.equals(country2));
    }*/
}
