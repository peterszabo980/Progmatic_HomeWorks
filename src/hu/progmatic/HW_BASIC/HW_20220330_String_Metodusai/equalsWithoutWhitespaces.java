package hu.progmatic.HW_BASIC.HW_20220330_String_Metodusai;

import java.util.Scanner;

public class equalsWithoutWhitespaces {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj egy szöveget!");
        String text1 = sc.nextLine();
        System.out.println("Add meg a 2. szöveget!");
        String text2 = sc.nextLine();
        System.out.println("Most ellenőrzöm, hogy ugyan az e a két szöveg.");

        Thread.sleep(1000);

        if (equalsWithoutWhitespaces(text1, text2)) {
            System.out.println("A két szöveg ugyan az.");
        } else {
            System.out.println("A két szöveg nem ugyan az.");
        }
    }

    public static boolean equalsWithoutWhitespaces (String text1, String text2) {
        String text3 = text1.trim();
        String text4 = text2.trim();
        if (text3.equals(text4)) {
            return true;
        } else {
            return false;
        }
    }
}
