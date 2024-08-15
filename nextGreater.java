import java.util.Scanner;
public class nextGreater {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n;
        n=s.nextInt();
        int ar[]=new int[n];
        boolean flag=false;
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int x=ar[i];
            flag=false;
            for(int j=i+1;j<n;j++){
                if(ar[j]>x){
                    System.out.print(ar[j]+" ");
                    flag=true;
                    break;
                }
            }
            if(!flag){
                 System.out.print("-1 ");
            }
        }
    }
}
