package hu.progmatic.HW_20220313_Gyakorlo_2;

import java.util.Scanner;

public class Medve_Csata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Medvék csatája játék");
        System.out.println("-----------------------------------------------------");
        System.out.println("Két medve csatázik egymással. Mindkét medvenak eltérő " +
                "életpontja és ereje van. A csata folyamán mindkét medve minden " +
                "körben sebzi a másikat - mindaddig, amíg az egyikük életereje el nem" +
                " fogy.");
        System.out.println("Xergej medve életpontja 100 és életereje 100 egység.");
        System.out.println("Vlagyi medve életpontja 100 és életereje 100 egység.");
        int Xhp = 100;
        int Xap = 50;
        int Vhp = 100;
        int Vap = 50;
        System.out.println("-----------------------------------------------------");
        String finish;

        do {
            do {
                System.out.println("Xergej megtámadja Vlagyit és megsebzi.");
                System.out.println("Mekkora volt a támadás ereje. Add meg 1-100-ig");
                int fire = sc.nextInt();

                if (fire < 0 || fire > 100 ){
                    do {
                        System.out.println("A támadás ereje 0 és 100 között kell, hogy legyen. Add meg újra!");
                        fire = sc.nextInt();
                    }
                    while (fire < 0 || fire > 100 );
                }
                sc.nextLine();
                Vhp -= fire;
                Xap -= (fire * 0.5);
                System.out.println("Xergejnek " + Xhp + " életpontja és " + Xap + " ereje maradt.");
                System.out.println("Vlagyinak " + Vhp + " életpontja és " + Vap + " ereje maradt.");
                if (Vhp <= 0 ) {
                    break;
                }
                System.out.println("Folytatod a harcot? (i / n)");
                finish = sc.nextLine();

            } while (!finish.equals("n"));

            if (Xhp <= 0 ) {
                System.out.println("A harc végetért. Vlagyin nyerte a csatát!");
                break;
            } else if (Vhp <= 0) {
                System.out.println("A harc végetért. Xergej nyerte a csatát!");
                break;
            }

            do {
                System.out.println("Vlagyit megtámadja Xergejt és megsebzi.");
                System.out.println("Mekkora volt a támadás ereje. Add meg 1-100-ig");
                int fire = sc.nextInt();

                if (fire < 0 || fire > 100 ){
                    do {
                        System.out.println("A támadás ereje 0 és 100 között kell, hogy legyen. Add meg újra!");
                        fire = sc.nextInt();
                    }
                    while (fire < 0 || fire > 100 );
                }
                sc.nextLine();
                Xhp -= fire;
                Vap -= (fire * 0.5);
                System.out.println("Xergejnek " + Xhp + " életpontja és " + Xap + " ereje maradt.");
                System.out.println("Vlagyinak " + Vhp + " életpontja és " + Vap + " ereje maradt.");

                if (Xhp <= 0 ) {
                    break;
                }

                System.out.println("Folytatod a harcot? (i / n)");
                finish = sc.nextLine();

            } while (!finish.equals("n"));

            if (Xhp <= 0 ) {
                System.out.println("A harc végetért. Vlagyin nyerte a csatát!");
                break;
            }

            System.out.println("Folytatódik a harc? (i / n)");
            finish = sc.nextLine();
            if (finish.equals("n")) {
                if ((Xhp + Xap) < (Vhp + Vap)) {
                    System.out.println("Vlagyi medve győzött!");
                } else if ((Xhp + Xap) > (Vhp + Vap)) {
                    System.out.println("Xergej medve győzött!");
                } else {
                    System.out.println("A harc döntetlen lett!");
                }
            }
        } while (!finish.equals("n"));

    }
}
