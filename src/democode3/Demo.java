package democode3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        a=b-a;
        b=b-a;
        a=a+b;
        System.out.println(a+" "+b);
    }
}
