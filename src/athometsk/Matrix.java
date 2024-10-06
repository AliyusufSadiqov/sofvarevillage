package athometsk;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("sutunu daxil et : ");
        int row = scanner.nextInt();
        System.out.println("setiri daxil et : ");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);

            }
        }
        for (int i = 0; i < matrix.length; i++) {
           System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }

        }
    }
}