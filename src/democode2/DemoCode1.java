package democode2;

public class DemoCode1 {
    public static void main(String[] args) {
        char[] sozler = {'(', ')', '[', ']', '{', '}','('};

        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (int i = 0; i < sozler.length; i++) {
            if (sozler[i] == '[') {
                sum++;
            } else if (sozler[i] == ']') {
                sum1++;

            } else if (sozler[i] == '(') {
                sum2++;


            } else if (sozler[i] == ')') {
                sum3++;

            } else if (sozler[i] == '{') {
                sum4++;

            } else if (sozler[i] == '}') {
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
