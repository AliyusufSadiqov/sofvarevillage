package democode1;

public class DemoCode2 {
    public static void main(String[] args) {
        String words1 = "hello f {} {}{ }{}))(09 ";
        char[] a = words1.toCharArray();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (char newWords:a) {

            if (newWords == '[') {
                sum++;
            } else if (newWords == ']') {
                sum1++;

            } else if (newWords == '(') {
                sum2++;


            } else if (newWords == ')') {
                sum3++;

            } else if (newWords == '{') {
                sum4++;

            } else if (newWords == '}') {
                sum5++;
            }


        }
        System.out.println(sum+" qeder '[' acilmis motereze var ");
        System.out.println(sum1+" qeder ']' baglanmis motereze var ");
        System.out.println(sum2+" qeder '(' acilmis motereze var ");
        System.out.println(sum3+" qeder ')' baglanmis motereze var ");
        System.out.println(sum4+" qeder '{' acilmis motereze var ");
        System.out.println(sum5+" qeder '}' baglanmis motereze var ");
    }


}
