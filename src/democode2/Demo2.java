package democode2;

public class Demo2 {
    public static void main(String[] args) {
        String sozler = "( hello ) java world";
        String[] s = sozler.split(" ");
        char[] chars = sozler.toCharArray();
        int sum = 0;
        int sum1=0;
        int sum3=0;

        for (char c : chars) {
            sum++;

        }
        System.out.println("herflrin sayi: " + sum);
        for (String soz : s) {

            sum1++;
        }

        System.out.println("sozlerin sayi: " + sum1);
    }


}