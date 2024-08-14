import java.util.Scanner;
public class u4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        str=s.nextLine();
        str=str.toLowerCase();
        char c[]=str.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
               result.append(c[i]).append(c[i]);
            }
            else{
              result.append(c[i]);
            }
        }
        System.out.println(result.toString());
    }
}
