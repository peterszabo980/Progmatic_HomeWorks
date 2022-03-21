package hu.progmatic.HW_2220320;

public class Metodusok_13_14 {
    public static void main(String[] args) {
        int[] numbersArray = {13, 5, 6, 2};
        int[] numbersArray2 = {-13, -5, -6, -2};
        int sum1 = sumNumbers(numbersArray);
        int sum2 = sumNumbers(new int[] {-3, 4, -7}); //így is meg lehet tömb értékét adni,
                                                        // amivel a metódus számol
        int sumZero = sumNumbers(new int[0]);

        System.out.println("1. összeg: " + sum1);
        System.out.println("2. összeg: " + sum2);
        System.out.println("3. összeg: " + sumZero);

        int sum4 = sumNumbersAbs(numbersArray2);
        System.out.println("4. összeg abszolútértékkel számolva: " + sum4);

    }

    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int sumNumbersAbs(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <numbers.length; i++) {
            sum += Math.abs(numbers[i]);
        }
        return sum;
    }
}
