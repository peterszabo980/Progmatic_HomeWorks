package hu.progmatic.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Faktorialis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a Faktorálandó számot!");
        int number = sc.nextInt();
        sc.nextLine();
        int faktor = 1;

        for (int i = 1; i <= number; i++) {
           faktor *= i;
        }
        System.out.println("A megdott szám Faktoriálisa: " + faktor);
    }
}
