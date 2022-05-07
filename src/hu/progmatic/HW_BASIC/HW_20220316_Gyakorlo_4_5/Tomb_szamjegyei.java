package hu.progmatic.HW_BASIC.HW_20220316_Gyakorlo_4_5;

public class Tomb_szamjegyei {
    public static void main(String[] args) {
        int[] numbers = {-42, 66, 33, 42, -69};
        int[] checkNumbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num < 0) {
                num = -numbers[i];
            } else {
                num = numbers[i];
            }

            do {
                int num1 = num % 10;
                checkNumbers[num1]++;
                num = num / 10;
            }
            while (num != 0);
        }

            for (int j = 0; j < checkNumbers.length ; j++) {
                System.out.println("A(z) " + j + " számból " + checkNumbers[j] + " db található.");
            }
    }
}
