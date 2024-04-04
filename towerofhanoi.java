
import java.util.Scanner;

public class towerofhanoi {

    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("the block " + n + " is transfered from " + src + "to " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, helper);
        System.out.println("the block " + n + " is transfered from " + src + " to " + dest);
        towerofhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter number of blocks");
        n = s.nextInt();
        towerofhanoi(n, "S", "H", "D");
    }
}
