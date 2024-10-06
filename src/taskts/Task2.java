package taskts;

import sun.reflect.ReflectionFactory;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cumleni daxil edin: ");
        String words = scanner.nextLine();
        System.out.println("hansi sozu axtarirsiz cumlede? :");
        String searchWord=scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < words.length() - 2; i++) {

            String substring = words.substring(i, i + 3);
            if (substring.equals(searchWord)) {
                System.out.println("cumlede " +searchWord+" sozu var");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("cumlede "+searchWord+" sozu yoxdur");


        }
    }
}
