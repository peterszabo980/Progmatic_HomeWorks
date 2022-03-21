package hu.progmatic.HW_20220315_Gyakorlo_3;

import java.util.Scanner;

public class Szamjegyosszegzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy db kétjegyű számot: ");
        String number = sc.nextLine();
        char a;
        int storage = 0;
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            a = number.charAt(i);
            storage = Character.getNumericValue(a);
            sum += storage;
        }

        System.out.println(sum);

    }
}
