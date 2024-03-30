import java.util.Scanner;
public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r;
        System.out.println("enter number of rows : ");
        r=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
