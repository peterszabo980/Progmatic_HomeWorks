package hu.progmatic.HW_20220315_Gyakorlo_3;

public class Maximumkereses {
    public static void main(String[] args) {
        int [] arrayA = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int maximum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > arrayA[maximum]) {
                maximum = i;
            }
        }
        System.out.print("A legnagyobb  szám a tömbben: " + arrayA[maximum]);
    }
}
