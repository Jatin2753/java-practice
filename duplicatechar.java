package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class duplicatechar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        int count = 1;
        System.out.println("enter the string : ");
        str = s.nextLine();
        int l = str.length();
        int arr[] = new int[l];
        char c[] = str.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < l; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
        for (int i = 0; i < l-1; i++) {
            if (c[i] == c[i + 1]) {
              
                count++;
            } else {
                if(count>=2)
                {
                    System.out.println("Count: " + count);
                }
                count = 1;
            }
        }
         System.out.println("Count: " + count);
    }
}
