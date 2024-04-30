package array;
import java.util.Scanner;
import java.util.Arrays;

public class kminmax {
    public static int kmax(int ar[], int n, int l, int m, int k) {
        if (l > m) {
            int temp = l;
            l = m;
            m = temp;
        }
        int ar2[] = new int[m - l];
        for (int i = l; i < m; i++) {
            ar2[i - l] = ar[i];
        }
        Arrays.sort(ar2);
        return ar2[m - l - k];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, l, m, k;
        System.out.println("Enter the number of elements: ");
        n = s.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            ar[i] = s.nextInt();
        }
        System.out.println("Enter starting index: ");
        l = s.nextInt();
        System.out.println("Enter ending index: ");
        m = s.nextInt();
        System.out.println("Enter which largest element to find: ");
        k = s.nextInt();
        int ans = kmax(ar, n, l, m, k);
        System.out.println("The " + k + "-th largest element is: " + ans);
    }
}
