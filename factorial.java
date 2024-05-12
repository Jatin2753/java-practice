package array;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,fact=1;
        System.out.println("enter the number");
        n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("the factorial is : "+fact);
    }
 
}
