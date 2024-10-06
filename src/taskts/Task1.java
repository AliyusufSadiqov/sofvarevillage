package taskts;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("sozu daxil edin");
        int count=0;
        String soz = scaner.nextLine();
        char[] chars = soz.toCharArray();
        for (int i = 0; i < soz.length(); i++) {
            for (int j = 1; j < soz.length()-1; j++) {

if(chars[i]==chars[j]){
    count++;
}
            }

        }                System.out.println(count + "<>");

    }
}
