package hu.progmatic.HW_20220330_String_Metodusai;

import java.util.Scanner;

public class getFirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy szöveget - visszaadom az első szavát.");
        String pharase = sc.nextLine();

        System.out.println(getFirstWord(pharase));
    }

    public static String getFirstWord(String text) {
        int index = text.indexOf(' ');
        if (index > -1) {
            return text.substring(0, index);
        } else {
            return text;
        }
    }
}
