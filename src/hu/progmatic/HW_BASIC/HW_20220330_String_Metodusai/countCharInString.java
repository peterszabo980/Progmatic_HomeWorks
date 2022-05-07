package hu.progmatic.HW_BASIC.HW_20220330_String_Metodusai;

import java.util.Scanner;

public class countCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérlek, adj egy szöveget.");
        String text = sc.nextLine();
        System.out.println("Add meg, hogy mely karaktert számoljam meg.");
        char c = sc.next().charAt(0);

        System.out.println("A megadott szövegnen a kért karakter száma: " + countCharInString(text, c));
    }

    public static int countCharInString (String text, char c) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            };
        }
        return count;
    }
}
