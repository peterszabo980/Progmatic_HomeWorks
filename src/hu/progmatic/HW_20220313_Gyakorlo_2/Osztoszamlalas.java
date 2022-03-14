package hu.progmatic.HW_20220313_Gyakorlo_2;

import java.util.Scanner;

public class Osztoszamlalas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérlek, adj meg egy természetes számot: ");
        int szam = sc.nextInt();
        sc.nextLine();

        int oszto = 1;
        int db = 0;
        while (oszto <= szam) {
            if (szam % oszto == 0) {
                db ++;
                System.out.println("A szám osztója: " + oszto);
            }
            oszto ++;
        }

        System.out.println();
        System.out.println(db + " db osztója van a megadott számnak.");

    }
}
