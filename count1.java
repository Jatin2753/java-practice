package matrix;

import java.util.Scanner;

public class count1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c,count=0;
        System.out.println("enter number of rows : ");
        r = s.nextInt();
        System.out.println("enter number of columns : ");
        c = s.nextInt();
        int ar[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("enter the element : "+(i+1)+" "+(j+1));
                ar[i][j] = s.nextInt();
            }
        }
        int countar[]=new int[r];
        for (int i = 0; i < r; i++) {
            count=0;
            for (int j = 0; j < c; j++) {
                if(ar[i][j]==1)
                {
                   count++;
                }
            }
            countar[i]=count;
        }
        int h=countar[0];
        int index=0;
        for(int i=1;i<countar.length;i++)
        {
            if(countar[i]>h)
            {
                h=countar[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
