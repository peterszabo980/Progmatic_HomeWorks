package hu.progmatic.HW_OOP.HW_20220425.club_01_practice;

public class App {
    public  static void main(String[] args) {

        Person member1 = new Person("001", "Lili", 28);
        Person member2 = new Person("002","Petra", 34);
        Person member3 = new Person("003", "Peti", 42);
        BronzeClubcard bc = new BronzeClubcard(member1, "2250.01.01.", 35);
        SilverClubcard sc = new SilverClubcard(member2, "2250.01.01.", 35);
        GoldClubcard gd = new GoldClubcard(member3, "2250.01.01.", 35);

        System.out.println(bc);
        System.out.println(sc);
        System.out.println(gd);

    }
}
