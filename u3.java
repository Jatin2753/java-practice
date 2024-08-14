import java.util.Scanner;

public class u3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close(); 
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length - 1; i += 2) {
            char temp = c[i];
            c[i] = c[i + 1];
            c[i + 1] = temp;
        }
        for (char ch : c) {
            System.out.print(ch);
        }
    }
}
