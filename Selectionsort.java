import java.util.Scanner;
public class Selectionsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n, temp;
        System.out.println("enter number of elements in array");
        n = s.nextInt();
        int ar[] = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        for(int i=0;i<ar.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[smallest]>ar[j])
                {
                    smallest=j;
                }
            }
            temp=ar[smallest];
            ar[smallest]=ar[i];
            ar[i]=temp;
        }
         for (int i = 0; i < n; i++) {
            System.out.print(ar[i]);
        }
    }
}
