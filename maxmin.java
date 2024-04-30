package array;
import java.util.Scanner;
public class maxmin {
    public static int max(int a[],int n)
    {
        int x=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(x<a[i])
            {
                x=a[i];
            }
        }
        return x;
    }
    public static int min(int a[],int n)
    {
        int x=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(x>a[i])
            {
                x=a[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter number of elements");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
        ar[i]=s.nextInt();
        }
        int max=max(ar,n);
        int min=min(ar,n);
        System.out.println("the maximum element is: "+max);
        System.out.println("the minimum element is: "+min);
    }
}
