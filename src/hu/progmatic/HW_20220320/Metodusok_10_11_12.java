package hu.progmatic.HW_20220320;

import java.util.Scanner;

public class Metodusok_10_11_12 {
    public static void main(String[] args) {
        System.out.println("Másodfokú függvény együtthatói.");
        System.out.println("Kérem az a értékét: ");
        int a = beker();
        System.out.println("Kérem a b értékét: ");
        int b = beker();
        System.out.println("Kérem a c értékét: ");
        int c = beker();
        System.out.println("Kérem az x értékét: ");
        int x = beker();

        int sum = (a * x * x) + (b * x) + c;
        System.out.println("10. feladat: A másodfokú függvény eredménye: " + sum);
        System.out.println("(" + a + " * " + x + " ÷ " + x + ")" + " + " + "(" + b + " * " + x + ")" + " + " + c);

        paramAlap(3, 5, 2, 2);
        paramAlap2(a, b, c, x);
    }

    public static int beker() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void paramAlap (int a, int b, int c, int x) {
        int sum = (a * x * x) + (b * x) + c;
        System.out.println("11. feladat: A másodfokú függvény eredménye: " + sum);
        System.out.println("(" + a + " * " + x + " ÷ " + x + ")" + " + " + "(" + b + " * " + x + ")" + " + " + c);
    }

    public static int paramAlap2 (int a, int b, int c, int x) {
        int sum = (a * x * x) + (b * x) + c;
        System.out.println("12. feladat: A másodfokú függvény eredménye: " + sum);
        System.out.println("(" + a + " * " + x + " ÷ " + x + ")" + " + " + "(" + b + " * " + x + ")" + " + " + c);
        return sum;
    }
}
