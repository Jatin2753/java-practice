package array;
import java.util.Scanner;
public class sort012 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,count0=0,count1=0,count2=0;
        System.out.println("enter number of elements: ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]==0)
            {
                count0++;
            }
            else if(ar[i]==1)
            {
                count1++;
            }
            else if(ar[i]==2)
            {
                count2++;
            }
            else{
                System.out.println("invalid input");
            }
             
        }
        for(int i=0;i<count0;i++)
        {
            System.out.print("0");
        }
        for(int i=0;i<count1;i++)
        {
            System.out.print("1");
        }
        for(int i=0;i<count2;i++)
        {
            System.out.print("2");
        }
              
    }
}
