package array;
import java.util.Scanner;

public class negativepositive {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = s.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        int negIndex = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] < 0) {
                if (i != negIndex) {
                    int temp = ar[i];
                    ar[i] = ar[negIndex];
                    ar[negIndex] = temp;
                }
                negIndex++;
            }
        }
        for (int i = 0; i < negIndex; i++) {
            System.out.print(ar[i] + " ");
        }

        for (int i = negIndex; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
