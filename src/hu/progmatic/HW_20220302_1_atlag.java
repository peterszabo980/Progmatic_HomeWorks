package hu.progmatic;

import java.util.Scanner;

public class HW_20220302_1_atlag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg az első számot: ");
        int number1 = scanner.nextInt();
        System.out.println("Kérem, adja meg a második számot: ");
        int number2 = scanner.nextInt();
        System.out.println("Kérem, adja meg a harmadik számot: ");
        int number3 = scanner.nextInt();
        double osszeg = number1 + number2 + number3;
        double atlag = (double) osszeg / 3;
        System.out.println("A három szám átlaga: " + atlag);
    }
}
