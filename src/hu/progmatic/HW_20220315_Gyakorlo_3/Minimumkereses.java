package hu.progmatic.HW_20220315_Gyakorlo_3;

public class Minimumkereses {
    public static void main(String[] args) {
        int [] arrayA = {12, -5, 0, 34, -7};
        int minimum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] < arrayA[minimum]) {
                minimum = i;
            }
        }
        System.out.print("A legkisebb szám a tömbben: " + arrayA[minimum]);
    }
}
