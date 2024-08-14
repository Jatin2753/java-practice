import java.util.Scanner;
public class u7 {
    public static void main(String[] args) {
        
        for (int i = 1; i < 5; i++) {  
          
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
//        for(int i=10-2;i>=0;i--){  
//            for(int j=0;j<10-i-1;j++){
//                 System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                 System.out.print("*");
//            }
//            System.out.println(" ");
//        }
    }
}
