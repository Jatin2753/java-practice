package array;
import java.util.Scanner;

public class RotatedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,shiftBy=1;
        System.out.println("enter the size of array");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
         int shiftedArr[]=new int[n];
         for (int i = 0; i < n; i++) {
            int newIndex = (i + shiftBy) % n; 
            shiftedArr[newIndex] = ar[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(shiftedArr[i]);
        }
           
    }
}
