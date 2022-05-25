package hu.progmatic.HW_OOP.HW_20220425.empire_01_practice;

import java.util.Objects;

public class Country {
    private final String ancestor;
    private String currentName;

    public Country(String ancestor) {
        this.ancestor = ancestor;
    }

    public Country(String ancestor, String currentName) {
        this.ancestor = ancestor;
        this.currentName = currentName;
    }

    public String getAncestor() {
        return ancestor;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return ancestor.equals(country.ancestor) && Objects.equals(currentName, country.currentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancestor, currentName);
    }
}
