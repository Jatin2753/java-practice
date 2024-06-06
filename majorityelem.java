package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class majorityelem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,count=0;
        System.out.println("enter number of elements in array");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element "+i);
            ar[i]=s.nextInt();
        }
        Arrays.sort(ar);
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                count++;
            }
            if(count==n/2)
            {
                System.out.println(ar[i]);
            }
        }
    }
  
}
