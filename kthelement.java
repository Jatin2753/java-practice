package matrix;
import java.util.Scanner;
import java.util.Arrays;

public class kthelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number of rows and columns : ");
        n=s.nextInt();
        int arr[][]=new int[n][n];
        //input array
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              System.out.println("enter the element : "+i+" "+j);  
              arr[i][j]=s.nextInt();
            }
        }
        int k;
        System.out.println("enter the element : ");
        k=s.nextInt();
        int index=0;
        int arr2[]=new int[n*n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[index]=arr[i][j];
                index++;
            }
        }
        Arrays.sort(arr2);
        System.out.println(arr2[k-1]);
    }
}
