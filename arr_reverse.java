package array;
import java.util.Scanner;
public class arr_reverse {
    public static void main(String[] args) {
         int n;
         Scanner s=new Scanner(System.in);
         System.out.println("enter number of elements : ");
         n = s.nextInt();
         int ar[]=new int[n];
         for(int i=0;i<n;i++)
         {
             ar[i]=s.nextInt();
         }
          int l=n;
          int ar2[]=new int[n];
         for(int j=0;j<n;j++){
         ar2[l-1]=ar[j];
             l-=1;
         }
         for(int i=0;i<n;i++)
         {
             System.out.println(ar2[i]);
         }
    }
   
}
