import java.util.Scanner;
public class Transposematrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rows,cols;
        System.out.println("enter rows ");
        rows=s.nextInt();
        System.out.println("enter columns ");
        cols=s.nextInt();
        int ar[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        int ar2[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                ar2[i][j]=ar[j][i];
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(ar2[i][j]);
            }
            System.out.println();
        }
    }
}
