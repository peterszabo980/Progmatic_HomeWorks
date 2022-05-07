package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Kozlekedesi_lampa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a közlekedési lámpa színét!");
        String color = sc.nextLine();;

        switch (color) {
            case "zöld":
                System.out.println("SZABAD");
                break;
            case "sárga":
                System.out.println("LASSÍTS");
                break;
            case "piros":
                System.out.println("MEGÁLLJ");
                break;
            default:
                System.out.println("NEM TUDOM");
                break;
        }
    }
}
