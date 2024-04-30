package array;
import java.util.Scanner;
import java.util.Arrays;
public class mergearray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m;
        System.out.println("enter number of element in first array : ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
             System.out.println("enter the element : "+i);
             ar[i]=s.nextInt();
        }
        Arrays.sort(ar); 
        System.out.println("enter number of element in second array : ");
        m=s.nextInt();
        int ar2[]=new int[m];
        for(int i=0;i<m;i++)
        {
             System.out.println("enter the element : "+i);
             ar2[i]=s.nextInt();
        }
        Arrays.sort(ar2); 
        int ar3[]=new int[n+m];
        int a=0,b=0,c=0;
        while(a<n)
        {
            ar3[c++]=ar[a++];
        }
        while(b<m)
        {
            ar3[c++]=ar2[b++];
        }
         Arrays.sort(ar3); 
         for(int i=0;i<m+n;i++)
         {
             System.out.print(ar3[i]+" ");
         }
         System.out.println();
         if(ar3.length%2!=0)
         {
            for(int i=ar3.length/2-1;i<=ar3.length/2;i++)
             {
                 System.out.println(ar3[i]);
             } 
         }
         else{
             for(int i=ar3.length/2;i<=ar3.length/2;i++)
             {
                 int sum=(ar3[i-1]+ar3[i])/2;
                 System.out.println("the median is : "+sum);
             }
         }
         
    }
}
