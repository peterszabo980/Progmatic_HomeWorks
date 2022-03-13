package hu.progmatic.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Szam_csokkentese_ha {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem a csökkenteni kívánt számot: ");
    int number = sc.nextInt();
    sc.nextLine();

    if (number <= 0) {
        System.out.println("A számot szabály szerint nem csökkentettük 1-el: " + number);
    } else {
        System.out.println("A szabály szerint 1-el csökkentett szám: " + (number - 1));
    }


    }
}
