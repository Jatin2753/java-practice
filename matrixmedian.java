package matrix;

import java.util.Scanner;

import java.util.Arrays;

public class matrixmedian {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c;
        System.out.println("enter number of rows:  ");
        r = s.nextInt();
        System.out.println("enter number of columns:  ");
        c = s.nextInt();
        int ar[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("enter element:  " + i + " " + j);
                ar[i][j] = s.nextInt();
            }
        }
        int[] ar2 = new int[r * c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ar2[index++] = ar[i][j];
            }
        }
        Arrays.sort(ar2);
        double median = 0;
        if (ar2.length % 2 == 0) {
            median = (ar2[ar2.length / 2 - 1] + ar2[ar2.length / 2]) / 2.0;
        } else {
            median = ar2[ar2.length / 2];
        }

        System.out.println(median);
    }
}
