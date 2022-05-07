package hu.progmatic.HW_BASIC.HW_20220316_Gyakorlo_4_5;

import java.util.Scanner;

public class tizes_szamrednszerbol_kettesbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív egész számot, megmondom a kettes számrendszeri megfelelőjét. ");
        int tizes = sc.nextInt();
        sc.nextLine();

        //int tizes = 10;
        String kettes = "";

        do {

            kettes = tizes % 2 + kettes;
            tizes = tizes / 2;

        } while (tizes != 0);

        System.out.println("A kettes számrendszeri megfelelője a megadott számnak: " + kettes);
    }
}
