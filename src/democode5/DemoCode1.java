package democode5;

public class DemoCode1 {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

   static int sum(int a) {
       if (a == 0) {
           return 0;
       }
        return a%10+sum(a/10);
    }
}
