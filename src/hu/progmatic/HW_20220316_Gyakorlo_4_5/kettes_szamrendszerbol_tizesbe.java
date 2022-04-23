package hu.progmatic.HW_20220316_Gyakorlo_4_5;

import java.util.Scanner;

public class kettes_szamrendszerbol_tizesbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg kettes számrendszerbeli számot (0-ák és 1-ek), megmondom a tizes számrendszeri megfelelőjét. ");
        String kettes = sc.nextLine();
        int a = Integer.parseInt(kettes);

        //String kettes = "1010";
        int tizes = Integer.parseInt(kettes, 2);


        System.out.println("A tizes számrendszeri megfelelője a megadott számnak: " + tizes);
        System.out.println("A tizes számrendszeri megfelelője a megadott számnak: " + getDecimal(a));
    }

    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }
}
