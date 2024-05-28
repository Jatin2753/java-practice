package matrix;
import java.util.Scanner;

public class Commonelements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c;
        System.out.println("Enter the number of rows: ");
        r = s.nextInt();
        System.out.println("Enter the number of columns: ");
        c = s.nextInt();
        int arr[][] = new int[r][c];
       
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the element : " + i + " " + j);
                arr[i][j] = s.nextInt();
            }
        }
       
        for (int j = 0; j < c; j++) { 
            int x = arr[0][j];
            int flag = 1;
            for (int i = 1; i < r; i++) { 
                int found = 0;
                for (int k = 0; k < c; k++) {
                    if (x == arr[i][k]) {
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(x);
            }
        }
    }
}
