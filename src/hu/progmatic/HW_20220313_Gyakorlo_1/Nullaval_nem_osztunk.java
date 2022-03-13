package hu.progmatic.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Nullaval_nem_osztunk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Kérem a második számot: ");
        int number2 = sc.nextInt();
        sc.nextLine();
        double sum = 0;

        if (number2 <= 0) {
            System.out.println("Nullával nem osztunk.");
        } else {
            sum = (double) number1 / number2;
        }
        System.out.println("A két szám osztásának eredménye: " + sum);



    }
}
