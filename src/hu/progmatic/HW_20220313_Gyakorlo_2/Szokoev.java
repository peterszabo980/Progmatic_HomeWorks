package hu.progmatic.HW_20220313_Gyakorlo_2;

import java.util.Scanner;

public class Szokoev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy évet:");
        int year = scanner.nextInt();

        if ((year > 1582) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Ez szökőév.");
        } else {
            System.out.println("Ez az év nem szökő év.");
        }
    }
}

