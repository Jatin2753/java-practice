package Strings;
import java.util.Scanner;
public class reverseStr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        str=s.nextLine();
        char c[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
    }
}
