import java.util.*;
public class maxarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements in array  :");
        n = s.nextInt();
        int ar[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the elements in array  :"+(i+1));
            ar[i] = s.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            int x = ar[i];
            flag = 0;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                list.add(ar[i]);
                
            }
        }
            System.out.print(list);
    }
}

