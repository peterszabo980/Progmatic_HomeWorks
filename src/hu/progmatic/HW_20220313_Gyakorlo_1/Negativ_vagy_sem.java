package hu.progmatic.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Negativ_vagy_sem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a meghatározni kívánt számot: ");
        int number = sc.nextInt();
        sc.nextLine();

        if (number < 0) {
            System.out.println("Negatív");
        } else if (number > 0) {
            System.out.println("Pozitív");
        } else {
            System.out.println("nulla");
        }
    }
}
