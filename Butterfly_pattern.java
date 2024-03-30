
import java.util.Scanner;

public class Butterfly_pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("enter no. of rows : ");
        a = s.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (a - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (a - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
