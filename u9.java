
import java.util.*;

public class u9 {

    static boolean isPrime(int j) {
        if (j <= 1) {
            return true;
        }
        if (j == 2) {
            return true;
        }
        if (j % 2 == 0) {
            return false;
        }
        int sqrtJ = (int) Math.sqrt(j);
        for (int i = 3; i <= sqrtJ; i += 2) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            if (!isPrime(i)) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (!isPrime(j)) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
