package array;
import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,k,count=0;
        System.out.println("enter number of elements in array : ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
                    System.out.println("enter element : "+i);
                    ar[i]=s.nextInt();
        }
        System.out.println("enter sum to be found : ");
        k=s.nextInt();
       for(int i=0;i<n;i++)
       {
          for(int j=i+1;j<n;j++)
         {
             int f=ar[i];
             if(f+ar[j]==k)
             {
                 System.out.println("the elements are: "+f+"and"+ar[j]);
                 count++;
             }
         }
       }
       System.out.println("total possibilities are "+count);   
        
    }
}
