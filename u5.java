import java.util.Scanner;
public class u5 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int count=1;
      boolean[] processed = new boolean[str.length()];
      for(int i=0;i<str.length();i++){
          if(processed[i]) continue;
          char c=str.charAt(i);
          count=0;
          for(int j=0;j<str.length();j++){
              if(str.charAt(j)==c){
                  count++;
                  processed[j] = true;
              }
          }
          System.out.print(count+ ""+str.charAt(i));
      }
      
    }
}
