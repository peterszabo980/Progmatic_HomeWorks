package hu.progmatic.HW_OOP.HW_20220425.empire_01_practice;

public class Region {
    Country country;
    Sovereign sovereign;

    public Region() {
    }

    public Region(Country country, Sovereign sovereign) {
        this.country = country;
        this.sovereign = sovereign;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Sovereign getSovereign() {
        return sovereign;
    }

    public void setSovereign(Sovereign sovereign) {
        this.sovereign = sovereign;
    }

    /*public static boolean isSuccessorOf(Region) {
       country.equals() && yearFrom == yearEnd;

     return true;
    }*/
}
