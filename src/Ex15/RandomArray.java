package Ex15;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and colum");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Enter a int number");
        }

        int row = sc.nextInt();
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Enter a int number");
        }
        int colum = sc.nextInt();
        int[][] arr = new int[row][colum];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
