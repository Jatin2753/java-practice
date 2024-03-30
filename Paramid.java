import java.util.Scanner;
public class Paramid {
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
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
