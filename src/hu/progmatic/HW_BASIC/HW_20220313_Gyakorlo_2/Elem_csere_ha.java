package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_2;

public class Elem_csere_ha {
    public static void main(String[] args) {
        int [] array = {2, 1, -4, 3};
        String letter = "";
        System.out.print("Az eredeti tömb tartalma: ");

        for (int i = 0; i < array.length; i++) {
            letter += array[i] + " ";
        }
        System.out.println(letter + " ");

        letter = "";

        if (array.length >= 2) {
            if (array[1] < array[0]) {
                int a = array[0];
                array[0] = array[1];
                array[1] = a;
            }
        }

        System.out.print("A megváltoztatott tömb: ");
        for (int i = 0; i < array.length; i++) {
            letter += array[i] + " ";
        }
        System.out.println(letter + " ");

    }
}
