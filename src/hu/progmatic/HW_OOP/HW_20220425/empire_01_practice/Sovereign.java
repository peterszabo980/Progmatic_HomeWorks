package hu.progmatic.HW_OOP.HW_20220425.empire_01_practice;

public class Sovereign {
    private final String birthName;
    private String name;

    public Sovereign(String birthName) {
        this.birthName = birthName;
    }

    public Sovereign(String birthName, String name) {
        this.birthName = birthName;
        this.name = name;
    }

    public String getBirthName() {
        return birthName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
