import java.util.Scanner;
import java.util.Arrays;
public class repeatedandmissing {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n,x=1;
       System.out.println("enter the number of elements in array : ");
       n=s.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           System.out.println("enter the elements : "+i);
           ar[i]=s.nextInt();
       }
       //repeated number
       Arrays.sort(ar);
       for(int i=0;i<n-1;i++)
       { 
           if(ar[i]==ar[i+1])
            {
                  System.out.println("the epeated number is :"+ar[i]);
            }  
       }
       
       // missing number
       for(int i=0;i<n;i++)
       {
           if(x!=ar[i])
           {
                System.out.println("the missing number is "+x);
           }
           x++;
       }
    }
}
