import java.util.Scanner;
public class u2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int n;
        System.out.println("enter no. of inputs : ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element : "+i);
            ar[i]=s.nextInt();
        }
        int k;
        System.out.println("enter the element : ");
        k=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ar[i]+ar[j]==k){
                   System.out.println(ar[i]+","+ar[j]);
                }
            }
        }
    }
}
