package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Szamok_kiirasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az n-edik elemt az 1-től n-ig való kiíráshoz:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("A n-ig lévő számok: ");
        for (int i = 1; i <= n; i++) {
            System.out.print( i + " ");
        }
    }
}
