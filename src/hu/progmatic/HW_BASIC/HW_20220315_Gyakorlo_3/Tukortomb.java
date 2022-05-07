package hu.progmatic.HW_BASIC.HW_20220315_Gyakorlo_3;

import java.util.Arrays;

public class Tukortomb {
    public static void main(String[] args) {
        int [] arrayA = {1, 2, 2, 3, 4, 7, 5, 4, 3, 2, 4, 8};
        System.out.print("Az eredeti tömb: " + Arrays.toString(arrayA));
        boolean mirror = arrayA.length > 0;

        for (int i = 0; i < arrayA.length / 2; i++) {
            int test = arrayA.length - 1 - i;

            if (arrayA[i] != arrayA[test] ) {
                mirror = false;
            }
        }
        System.out.println();
        if (mirror == false) {
            System.out.println("A tömb nem tükörtöm! " + Arrays.toString(arrayA));
        } else  {
            System.out.println("A tömb tükör tömb! " + Arrays.toString(arrayA));
        }

    }
}
