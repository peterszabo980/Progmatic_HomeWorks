package hu.progmatic.HW_20220313_Gyakorlo_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tomb_noveles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = {-33, 66, 42, -13, 54, 89};
        System.out.println("Eredeti tömb.");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int a = 0;
        System.out.print("A bővítmény: " + a);
        System.out.println();
        int [] newArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] += array[i];
        }
        newArray[newArray.length-1] = a;
        System.out.println("Bővített tömb.");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

   /*
        ArrayList<String> gyumolcsok = new ArrayList<>();
        System.out.println("Kérem a gyümölcsök darabszámát!");
        int darabSzam = scanner.nextInt();
        scanner.nextLine();

        while (gyumolcsok.size() < darabSzam) {
            System.out.println("Írj egy gyümölcsöt!");
            String gyumolcs;
            gyumolcs = scanner.nextLine();
            scanner.nextLine();
            gyumolcsok.add(gyumolcs);
            System.out.println(gyumolcsok.size() + " gyümölcsöt adtál meg eddig, még " + (darabSzam - gyumolcsok.size()) + " hiányzik a listádról.");
        }
        System.out.println("Beírtad a " + darabSzam + "db gyümölcsöt");
 */
    }
}
