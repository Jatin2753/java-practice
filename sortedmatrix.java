package matrix;
import java.util.Scanner;
import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number of rows and columns : ");
        n=s.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              System.out.println("enter the element : "+(i+1)+" "+(j+1));
              arr[i][j]=s.nextInt();  
            }
        }
        int flatarr[]=new int[n*n];
        int index=0;
       for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              flatarr[index]=arr[i][j];
              index++;
            }
        }
       Arrays.sort(flatarr);
       index=0;
       for(int i=0;i<n;i++)
        { 
            for(int j=0;j<n;j++)
             { 
              System.out.print(flatarr[index]);
              index++;
             }
             System.out.println();
        }
    }
}
