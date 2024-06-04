package sorting;
import java.util.Scanner;
import java.util.Arrays;
public class searchindex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,target;
        System.out.println("enter the number of elements : ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the elements : "+i);
           ar[i]=s.nextInt(); 
        }
        System.out.println("enter the targeted elements : ");
        target=s.nextInt();
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]==target)
            {
                System.out.println(i);
                break;
            }
        }
         for(int i=n-1;i>0;i--)
        {
            if(ar[i]==target)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
