
public class u8 {
    public static void main(String[] args) {
      int count=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<5-i;j++){
                 System.out.print(count);
                 count++;
            }
             System.out.println(" ");
        }
        count=count*2-2;
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(count);
                count--;
            }
             System.out.println(" ");
        }
    }
}
