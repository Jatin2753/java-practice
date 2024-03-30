import java.util.Scanner;
public class Parallogram_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r;
        System.out.println("enter number of rows : ");
        r=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1; j<=r-i;j++)
            {
                System.out.print(" ");
            }
             for(int j=1; j<=r;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
        
        
    }
}
