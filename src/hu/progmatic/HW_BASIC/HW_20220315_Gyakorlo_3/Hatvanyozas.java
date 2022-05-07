package hu.progmatic.HW_BASIC.HW_20220315_Gyakorlo_3;

import java.util.Scanner;

public class Hatvanyozas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a hatványozni kívánt számot: ");
        int a = sc.nextInt();
        System.out.print("Add meg a hatványt: ");
        int b = sc.nextInt();
        int sum = 1;
        int c = a;
        for (int i = 1; i < b; i++) {
            c *= a;
            sum = c;
        }
        System.out.print("A megadott szám hatványa: " + sum);

    }
}
