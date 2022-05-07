package hu.progmatic.HW_20220320_Metodusok;

public class Metodusok_15 {
    public static void main(String[] args) {
        String [] fruits = {"körte", "alma", "almalé", "almatorta", "banán"};
        int a = sumFruits(fruits);
    }

    public static int sumFruits (String [] fruits) {
        String text = "alma";

        int db = 0;

        for (int i = 0; i < fruits.length; i++) {
            String text2 = fruits[i];
            if (text2.startsWith("alma")) {
                db ++;
            }
        }
        System.out.println("A tömben lévő alma-val keződő ételek száma: " + db);
        return  db;
    }
}
