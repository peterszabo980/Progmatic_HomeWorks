package hu.progmatic.HW_20220313_Gyakorlo_1;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az összefűzendő karakterek számát!");
        int number = sc.nextInt();
        sc.nextLine();
        String abc = "";

            for (int i = 0; i < number; i++) {
                char betu = (char) ('a' + i);
                abc += betu;
            }
        System.out.println(abc);
    }
}
