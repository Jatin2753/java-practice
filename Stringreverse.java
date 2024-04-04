import java.util.Scanner;
public class Stringreverse {
     //from function
    public static void rev(String str,int index)
    {
        if(index==0)
        {
             System.out.print( str.charAt(index));
             return;
        }
        System.out.print( str.charAt(index));
        rev(str,index-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str,str2="";
        str=s.nextLine();
        rev(str,str.length()-1);
        System.out.println();
        //from loop
        char c[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            str2+=c[i];
        }
        System.out.println(str2);
        
       
        
    }
}
