import java.util.Scanner;
public class decgrowth {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,count=0;
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=1;i<n;i++){
            if(ar[i]<ar[i-1]) count++; 
        }
        System.out.println(count);
    }
}
