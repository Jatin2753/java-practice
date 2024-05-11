package array;

import java.util.Scanner;

public class common_elements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("enter number of elements in array 1 : ");
        n1 = s.nextInt();
        int ar1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("enter element  : " + i);
            ar1[i] = s.nextInt();
        }
        System.out.println("enter number of elements in array 1 : ");
        n2 = s.nextInt();
        int ar2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.println("enter element  : " + i);
            ar2[i] = s.nextInt();
        }
        System.out.println("enter number of elements in array 1 : ");
        n3 = s.nextInt();
        int ar3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            System.out.println("enter element  : " + i);
            ar3[i] = s.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n3; k++) {
                    if (ar1[i] == ar2[j] && ar1[i] == ar3[k]) {
                        System.out.println("the element is " + ar1[i]);
                    }
                }
            }
        }
    }
}
