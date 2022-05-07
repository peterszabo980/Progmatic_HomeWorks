package hu.progmatic.HW_20220330_String_Metodusai;

import java.util.Scanner;

public class getLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy szöveget - visszaadom az utolsó szavát.");
        String word = sc.nextLine();

        System.out.println(getLastWord(word));
    }

    public static String getLastWord(String text) {
        int lastIndex = text.lastIndexOf(" ");
        String word = text.substring(lastIndex + 1);

        return word;
    }
}
