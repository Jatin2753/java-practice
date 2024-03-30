import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("enter array size");
        a=s.nextInt();
        int ar[]=new int[a];
        int target;
         System.out.println("enter array numbers");
        for(int i=0;i<a;i++)
        {
            ar[i]=s.nextInt();
        }
         System.out.println("enter target");
        target=s.nextInt();
        for(int i=0;i<ar.length;i++)
        {
           if(ar[i]==target)
           {
               System.out.println(i);
           }
        }
        
    }
}
