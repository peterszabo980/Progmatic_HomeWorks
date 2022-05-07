package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_2;

public class Elem_csere {
    public static void main(String[] args) {
        char [] array = {'b', 'c', '%', '?', 'a'};
        String letter = "";
        System.out.print("Az eredeti tömb tartalma: ");

        for (int i = 0; i < array.length; i++) {
            letter += array[i] + " ";
        }
        System.out.println(letter + " ");

        letter = "";

        if (array.length > 1) {
            char a = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = a;
        }

        System.out.print("A megváltoztatott tömb: ");
        for (int i = 0; i < array.length; i++) {
            letter += array[i] + " ";
        }
        System.out.println(letter + " ");

    }
}
