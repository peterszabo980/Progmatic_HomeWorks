package hu.progmatic.HW_20220313_Gyakorlo_2;

import java.util.Scanner;

public class Primszam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");

        long szam = scanner.nextLong();
        scanner.nextLine();

        long oszto = 1;
        long db = 0;
        while (oszto <= szam) {
            if (szam % oszto == 0) {
                db++;
            }
            oszto++;
        }

        if (db == 2) {
            System.out.println("Ez a szám primszám");
        } else {
            System.out.println("Ez a szám nem prímszám.");
        }
    }
}

