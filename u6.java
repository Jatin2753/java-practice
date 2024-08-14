import java.util.Scanner;
public class u6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int count=0;
        if(str1.length()!=str2.length()){
        System.out.println("not equal");
        }
        else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    count++;
                }
            }
            if(count==0) {
                System.out.println("equal string");
            }
           else if(count>2){
             System.out.println("not 1 char difference");
        }
        else{
             System.out.println("1 char difference");
        }
        }
        
    }
}
