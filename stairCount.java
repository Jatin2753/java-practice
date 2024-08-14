import java.util.Scanner;
public class stairCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(ar[i]%3==0) count++;
        }
        System.out.println(count);
    }
}
