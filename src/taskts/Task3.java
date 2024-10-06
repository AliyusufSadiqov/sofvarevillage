package taskts;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("******* MENU *******");
        System.out.println("1. Ters cevirmek istediyniz sozu daxil edin: ");

        System.out.println("2. Sozun palindrom olub olmamsini yoxlamaq ucun sozu daxil edin: ");

        int a=s.nextByte();
        switch (a){
            case  1:
                System.out.println();
                break;
        }

    }

    static String tersSoz(String soz) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sozu daxil edin: ");
        String s=scanner.nextLine();
        StringBuilder word=new StringBuilder(s);



        return word.reverse().toString();
    }

    static boolean palindrom(String soz1) {
        String ters = tersSoz(soz1);
        return (soz1.equals(ters));
    }
}