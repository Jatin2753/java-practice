package sorting;
import java.util.Scanner;
public class greaterinthree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A,B,C,largest;
        A=s.nextInt();
        B=s.nextInt();
        C=s.nextInt();
           largest = (A >= B && A >= C) ? ((B >= C) ? B : C) :(B >= A && B >= C) ? ((A >= C) ? A : C) : ((A >= B) ? A : B);
    System.out.println(largest);
    }
}
