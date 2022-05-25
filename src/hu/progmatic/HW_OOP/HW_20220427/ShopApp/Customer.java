package hu.progmatic.HW_OOP.HW_20220427.ShopApp;

public class Customer {
    private String gender;
    private int age;
    private int money;

    public Customer() {
    }

    public Customer(String gender, int age, int money) {
        this.gender = gender;
        this.age = age;
        this.money = money;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
