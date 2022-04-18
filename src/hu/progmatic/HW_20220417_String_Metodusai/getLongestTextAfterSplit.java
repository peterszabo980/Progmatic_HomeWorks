package hu.progmatic.HW_20220417_String_Metodusai;

import java.util.Scanner;

public class getLongestTextAfterSplit {
    public static void main(String[] args) {
        /*
        Program teszteléséhez:

        String text = "alma,barack,dinnye-cseresznye,eper-málna-körte,szőlő", splitAt = " ";
    	megoldás: "alma,barack,dinnye-cseresznye,eper-málna-körte,szőlő"
        String text = "alma,barack,dinnye-cseresznye,eper-málna-körte,szőlő", splitAt = ",";
	    megoldás: "dinnye-cseresznye"
        String text = "alma,barack,dinnye-cseresznye,eper-málna-körte,szőlő", splitAt = "-";
	    megoldás: "alma,barack,dinnye"
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérlek, adj egy szöveget és azt szétbontom " +
                " külön szövegekre adott karaktersorozattá, és visszaadom " +
                "az így kapott szövegek közül a leghosszabbat. ");
        String text = sc.nextLine();
        System.out.println("Kérlek, add meg, hogy mi alapján vágjam szét a szöveget (\" \" vagy - vagy ,)");
        String splitAt = sc.nextLine();

        System.out.println("A leghosszabb szöveg: " + getLongestTextAfterSplit(text, splitAt));

    }

    public static String getLongestTextAfterSplit (String text, String splitAt) {
        String[] textAfter = text.split(splitAt);
        String word = textAfter[0];

        for (int i = 0; i < textAfter.length - 1; i++) {
            if (textAfter[i].length() > textAfter[i + 1].length()) {
                word = textAfter[i];
                break;
            }
        }
        return word;
    }
}

