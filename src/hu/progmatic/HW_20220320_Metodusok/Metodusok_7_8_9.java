package hu.progmatic.HW_20220320_Metodusok;

import java.util.Scanner;

public class Metodusok_7_8_9 {
    public static void main(String[] args) {

      int num1 = 45;
      int num2 = 23;
      beker();
      System.out.println("A megadott paraméterek: " + num1 + " és a " + num2);
      paramAlap(num1, num2);
      paramAlap2(num1, num2);
    }

    public static void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int num1 = sc.nextInt();
        System.out.println("Kérem a második számot: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("7. feladat: Az első a nagyobb szám.");
        } else {
            System.out.println("7. feladat: A második a nagyobb szám.");
        }

    }

    public static void paramAlap (int num1, int num2) {
        if (num1 > num2) {
            System.out.println("8. feladat: A megadott paraméterek alapján az első a nagyobb szám.");
        } else {
            System.out.println("8. feladat: A megadott paraméterek alapján a második a nagyobb szám.");
        }
    }

    public static int paramAlap2 (int num1, int num2) {
        if (num1 > num2) {
            System.out.println("9. feladat: A megadott paraméterek alapján az első a nagyobb szám.");
            return num1;
        } else {
            System.out.println("9. feladat: A megadott paraméterek alapján a második a nagyobb szám.");
            return num2;
        }
    }

}
