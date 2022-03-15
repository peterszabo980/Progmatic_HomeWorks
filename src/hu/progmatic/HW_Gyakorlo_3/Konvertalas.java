package hu.progmatic.HW_Gyakorlo_3;

import java.util.Arrays;

public class Konvertalas {
    public static void main(String[] args) {
        int [] arrayA = {-33, 66, 42, -13, 54, 89};
        String [] arrayB = new String[arrayA.length];

        System.out.println("Eredeti tömb: " + Arrays.toString(arrayA));
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = String.valueOf(arrayA[i]);
        }
        System.out.print("A String tömb elemei: " + Arrays.toString(arrayB));
    }
}
