package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_1;

public class Tomb_szovegge {
    public static void main(String[] args) {
        int [] tomb = {1, 2, 3, 4, 5};
        String szoveg = "[";

        for (int i = 0; i < tomb.length; i++) {
            szoveg += tomb[i];

            if (i < tomb.length -1) {
                szoveg += ", ";
            }
        }
        System.out.print(szoveg + "]");
    }
}
