package array;

import java.util.Scanner;

public class InsersionandUniun {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m;
        System.out.println("enter the size of first array : ");
        n = s.nextInt();
        System.out.println("enter the size of second array : ");
        m = s.nextInt();
        int ar[] = new int[n];
        int ar2[] = new int[m];
        int f, count = 0, flag, c;

        System.out.println("enter elements of first array : ");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("enter elements of second array : ");
        for (int i = 0; i < m; i++) {
            ar2[i] = s.nextInt();
        }
        System.out.println("enter choice 1. uniun 2. intersection");
        c = s.nextInt();
        switch (c) {
            case 1:
                for (int j = 0; j < ar.length; j++) {
                    f = ar[j];
                    flag = 0;
                    for (int i = 0; i < ar2.length; i++) {
                        if (f == ar2[i]) {
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        count++;
                    }
                }
                System.out.println("the uniun count is" + (count + ar2.length));
                break;
            case 2:count=ar.length;
                for (int j = 0; j < ar.length; j++) {
                    f = ar[j];
                    flag = 0;
                    for (int i = 0; i < ar2.length; i++) {
                        if (f == ar2[i]) {
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        count--;
                    }
                }
                System.out.println("the intersection count is" + count);
                break;
            default:    System.out.println("invalid choice");
        }

    }
}
