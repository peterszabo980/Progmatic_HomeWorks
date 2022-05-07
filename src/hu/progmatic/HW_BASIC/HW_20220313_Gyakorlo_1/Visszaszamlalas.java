package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Visszaszamlalas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az n-edik elemt az 1-től n-ig való kiíráshoz:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("A 0-ig lévő számok n-től: ");
        for (int i = n; i >= 0; i--) {
            System.out.print( i + " ");
        }
    }
}
