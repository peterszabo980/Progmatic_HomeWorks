package hu.progmatic.HW_20220320;

import java.util.Scanner;

public class Metodusok_4_5_6 {
    public static void main(String[] args) {
        System.out.println("Kérem az első számot: ");
        int beker1 = beker();
        System.out.println("Kérem a második számot: ");
        int beker2 = beker();
        System.out.println("Kérem a harmadik számot: ");
        int beker3 = beker();

        System.out.println("4. feladat: A megadott számok összege: " + (beker1 + beker2 + beker3));
        sum(2, 3, 5);
        sum2(beker1, beker2, beker3);
    }

    public static int beker() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("4. feladat: A megadott számok összege: " + (num1 + num2 + num3));
        return sc.nextInt();
    }

    public static void sum(int num1, int num2, int num3) {
        int sum1 = num1 + num2 + num3;
        System.out.println("5. feladat: A megadott számok összege: " + sum1);
    }

    public static int sum2(int num1, int num2, int num3) {
        int sum2 = num1 + num2 + num3;
        System.out.println("6. feladat: A megadott számok összege: " + sum2);

        return sum2;
    }
}