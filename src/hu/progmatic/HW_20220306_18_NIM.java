package hu.progmatic;

import java.util.Scanner;

public class HW_20220306_18_NIM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Köszöntelek a Nim játékban.");
        System.out.println("A játék szabálya: a két játékos minden körben felváltva húz minimum 1, maximum 3 gyufát.\n" +
                "Az a játékos veszít, aki az utolsó gyufát felveszi az asztalról.\n ");

        System.out.print("Kérem az első játékos nevét: ");
        String first = scanner.nextLine();
        System.out.print("Kérem a második játékos nevét: ");
        String second = scanner.nextLine();
        System.out.println();
        System.out.println("A játékban szereplő gyufák számát az általatok megadott számok átlagából képezzük.");
        System.out.print(first + ", kérlek, adj egy számot 1 és 100 között: ");
        int numb1 = scanner.nextInt();
        System.out.print(second + ", kérlek, adj egy számot 1 és 100 között: ");
        int numb2 = scanner.nextInt();
        int szam = ( numb1 + numb2 ) / 2;
        System.out.println("A gyufák száma: " + szam);

        String nev;
        boolean elsoLep = true;
        int a = 0;

        while (szam != 1 && szam > 1) {

            if (elsoLep = elsoLep) {
                nev = first;
            } else {
                nev = second;
            }
            System.out.println("Húz egy gyufát " + nev + ". Mennyit (1 és 3 között)");
            a = scanner.nextInt();
            while (a < 1 || a > 3) {
                System.out.println(nev + " Kérlek, hogy 1 és 3 közötti számot adj meg.");
                a = scanner.nextInt();
            }

            szam = szam - a;

            System.out.println("A maradék gyufák száma: " + szam);
            elsoLep = !elsoLep;

            while (szam == 3) {

                System.out.println("Kérlek, hogy 1 és 2 közötti számot adj meg.");
                a = scanner.nextInt();
                while (a < 1 || a > 2) {
                    System.out.println("Kérlek, hogy 1 és 2 közötti számot adj meg.");
                    a = scanner.nextInt();
                }
                szam = szam - a;
                if (szam == 1) {
                    System.out.println("Gratulálunk!! " + nev + " nyerttél!");
                }
            }

            while (szam == 2) {

                System.out.println("Már csak 1-et tudsz elvenni. Gratulálunk! " + nev + " nyertél.");
                a = scanner.nextInt();
                while (a < 1 || a >= 2) {
                    System.out.println("Kérlek, hogy 1 gyufát vegyél el. Gratulálunk! " + nev + " nyertél.");
                    a = scanner.nextInt();
                }
                szam = szam - a;
            }
        }
        System.out.println("Vége a játéknak.");

    }
}
