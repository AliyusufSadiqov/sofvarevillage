package athometsk;

import java.util.Scanner;

public class Piramit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sutun sayi girin : ");
        int sutun = scanner.nextInt();
        int setirSayi1 = scanner.nextInt();

        for (int i = 1; i <= sutun; i++) {
            for (int j = 1; j <= sutun - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = setirSayi1; i >= 1; i--) {
            for (int j = 1; j <= setirSayi1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
