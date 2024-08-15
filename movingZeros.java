import java.util.Scanner;
public class movingZeros {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[]=new int[n];
        int j=0;
        int ar2[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                ar2[j]=ar[i];
                j++;
            }
        }
        while(j!=n-1){
            ar[j]=0;
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(ar2[i]+" ");
        }
    }
}
