package hu.progmatic.HW_20220316_Gyakorlo_4_5;

import java.util.Arrays;

public class Random_tomb {
    public static void main(String[] args) {

        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            boolean nemUjSzam;

        do {
            nemUjSzam = false;
            int test = (int) (Math.random() * 10 + 1);
            for (int j = 0; j <= i; j++) {
                if (randomArray[j] == test){
                    nemUjSzam = true;
                    break;
                }
            }
            randomArray[i] = test;
        }

        while(nemUjSzam);

        }

        System.out.print(Arrays.toString(randomArray));

    }
}

