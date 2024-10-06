package democode3;

public class Demo2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 8, 23, 12, 123, 234, 45, 67};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int maxNumber = Math.max(array[i], array[j]);
                if (maxNumber == array[j]) {
                    int max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                    System.out.println(max);

                }
            }

        }
    }
}

