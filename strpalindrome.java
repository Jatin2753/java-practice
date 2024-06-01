package Strings;
import java.util.Scanner;
public class strpalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        boolean check=true;
        str=s.nextLine();
        int l=str.length();
        char c[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++)
        {
            if(c[i]!=c[l-i-1])
            {
                check=false;
            }
        }
        if(check)
        {
             System.out.println(" paindrome");
        }
        else{
             System.out.println("not paindrome");
        }
    }
}
