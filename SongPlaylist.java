
import java.util.Scanner;

public class SongPlaylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter playlist :");
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(favCount(str, n));
    }

    static int favCount(String str, int n) {
        int i = 0, j = n;
        int maxCount = 0;
        while (j <= str.length()) {
            int count = 0;
            String subStr = str.substring(i, j);
            System.out.println(subStr);
            for (int k = 0; k < n; k++) {
                System.out.println(subStr.charAt(k));
                if (subStr.charAt(k) == 'a') {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
            i++;
            j++;
        }
        return maxCount;
    }
}
