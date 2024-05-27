package matrix;

import java.util.Scanner;

public class rotate90 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the number of rows and column : ");
        n = s.nextInt();
        int ar[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter the element : " + i + " " + j);
                ar[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //transpose of matrix 
        int ar2[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar2[j][i] = ar[i][j];
            }
        }
        //print the output
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(ar2[i][j]);
            }
            System.out.println();
        }
    }
}
