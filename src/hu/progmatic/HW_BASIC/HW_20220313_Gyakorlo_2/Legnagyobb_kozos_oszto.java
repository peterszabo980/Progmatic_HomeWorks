package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_2;

import java.util.Scanner;

public class Legnagyobb_kozos_oszto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek, add meg az első számot: ");
        int szam1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérlek, add meg a második számot: ");
        int szam2 = scanner.nextInt();
        scanner.nextLine();

        int oszto = 1;
        int db = 0;
        int kozos = 0;

        if (szam1 <= szam2) {
            while (oszto <= szam1) {
                if (szam1 % oszto == 0 && szam2 % oszto == 0) {
                    db ++;
                    kozos = oszto;
                    System.out.println("A szám osztója: " + oszto);
                }
                oszto ++;
            }
        }

        if (szam2 <= szam1) {
            while (oszto <= szam2) {
                if (szam2 % oszto == 0 && szam1 % oszto == 0) {
                    db ++;
                    kozos = oszto;
                    System.out.println("A szám osztója: " + oszto);
                }
                oszto ++;
            }
        }

        System.out.println("A legnagyobb közös osztó: " + kozos);

    }
}
