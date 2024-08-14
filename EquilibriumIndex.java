import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
             int suml=0;
             int sumr=0;
            for(int j=0;j<i;j++){
                suml+=ar[j];
            }
            for(int k=i+1;k<n;k++){
                sumr+=ar[k];
            }
            if(suml==sumr) {
               System.out.println(i);
                break;
            }
        }
    }
}
