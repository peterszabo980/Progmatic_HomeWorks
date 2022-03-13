package hu.progmatic;

import java.util.Scanner;

public class HW_20220302_2_osztas_maradek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg az első számot: ");
        int number1 = scanner.nextInt();
        System.out.println("Kérem, adja meg a második számot: ");
        int number2 = scanner.nextInt();

        int osztas = number1 / number2;
        int maradek = number1-(number2*osztas);
        System.out.println("A két szám elosztása: " + osztas);
        System.out.println("A maradék: " + maradek);
    }
}
