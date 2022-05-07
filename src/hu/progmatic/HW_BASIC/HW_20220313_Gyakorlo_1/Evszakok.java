package hu.progmatic.HW_BASIC.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class Evszakok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a hónapot, megmondom melyik évszak!");
        String month = sc.nextLine();

        switch (month) {
            case "december", "január", "február":
                System.out.println("A " + month + " a tél egyik hónapja.");
                break;
            case "március", "április", "május":
                System.out.println("A " + month + " a tavasz egyik hónapja.");
                break;
            case "június", "július", "augusztus":
                System.out.println("A " + month + " a nyár egyik hónapja.");
                break;
            case "szeptember", "október", "november":
                System.out.println("A " + month + " az ősz egyik hónapja.");
                break;
            default:
                System.out.println("Nem meghatározható!");
        }
    }
}
