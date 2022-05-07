package hu.progmatic.HW_BASIC.HW_20220316_Gyakorlo_4_5;

import java.util.Arrays;
import java.util.Scanner;

public class Szam_osztoi_tomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérlek, adj meg egy természetes számot: ");
        int szam = sc.nextInt();
        sc.nextLine();
        //int szam = 16;
        int db = 0;
        int oszto = 1;
        String osztokEgyutt = "";

        while (oszto <= szam) {
            if (szam % oszto == 0) {
                db ++;
                //System.out.println("A szám osztója: " + oszto);
                osztokEgyutt += oszto + " ";
            }
            oszto ++;
        }

        String[] osztokBetu = osztokEgyutt.split(" ");
        int[] osztokTomb = new int[db];
        for (int i = 0; i < osztokTomb.length; i++) {
            osztokTomb[i] = Integer.parseInt(osztokBetu[i]);
        }

        System.out.println("A megadott szám tömbben tárolt osztói a következők: " + Arrays.toString(osztokTomb));

    }
}



