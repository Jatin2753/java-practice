package array;
import java.util.Scanner;
import java.lang.Math;
public class arrpalendrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int flag=0,n,count=0;
        
        System.out.println("enter no. of elements: ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter element: "+i);
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int b=0;
            int sum=0;
            int temp=ar[i];
            int temp2=temp;
            count=0;
            while(temp!=0)
            {
                count++;
                temp=temp/10;
            }
            
            while(temp2!=0)
            {
              b=temp2%10;
              sum=sum*10+b; 
             temp2=temp2/10;
            }
         
            if(sum==ar[i])
            {
                flag=0;
            }
            else{  
               flag=1;
               break;
            }
        }
        
        if(flag==1)
        {
            System.out.println("its not a palendrome array");
        }
         else
        {
            System.out.println("its a palendrome array");
        }
    }
}
