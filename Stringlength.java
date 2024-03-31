import java.util.Scanner;
public class Stringlength {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter length of array");
        n=s.nextInt();
        s.nextLine();
        String ar[]=new String[n];
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter the string "+i);
            ar[i]=s.nextLine();
             sum+=ar[i].length();
        }
        System.out.println(sum);
    }
}
