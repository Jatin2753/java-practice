import java.util.Scanner;
import java.util.ArrayList; 

public class u1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter no. of inputs : ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element : "+i);
            ar[i]=s.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int currentElement = ar[i];
            if (list.contains(currentElement)) {
                list.remove(Integer.valueOf(currentElement)); // Remove by value
            } else {
                list.add(currentElement);
            }
        }
        for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
        }
       
    }
}
