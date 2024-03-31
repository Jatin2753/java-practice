
import java.util.Scanner;

public class Bubblesort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, temp;
        System.out.println("enter number of elements in array");
        n = s.nextInt();
        int ar[] = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]);
        }
    }
}
