package hu.progmatic.HW_OOP.HW_20220425.empire_01_practice;

public class Interval {
    private static int currentYear;
    private int yearFrom;
    private Integer yearTo;
    private int length;

    public Interval() {
    }

    public Interval(int yearFrom, Integer yearTo, int length) {
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
        this.length = length;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public static void setCurrentYear(int currentYear) {
        Interval.currentYear = currentYear;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(int yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }

    public int getLength() {
        if (yearTo == null) {
            return currentYear;
        } else {
            return length;
        }
    }

    public void setLength(int length) {
        this.length = length;
    }
}
