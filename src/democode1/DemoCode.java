package democode1;

import java.util.Scanner;

public class DemoCode {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        for (; ; ) {
            String baseWord = scr.nextLine();
            String[] array = {"alma", "ananas", "armud", "banan", "qarpiz", "yemis", "limon", "portagal"};
            for (String a : array) {
                System.out.print(a + ",");

                int i = a.compareTo(baseWord);

                if (i == 0) {
                    System.out.println("sozler eynidir");

                } else if (i == -32) {
                    System.out.println("yazilan soze aid soz yoxdur");
                } else if (i<0) {
                    System.out.println(-i+" qeder artig soz var.");


            } else {
                    System.out.println("yazdiginiz soze aid abyekt tapilmadi");
                }
            }
        }
    }
}