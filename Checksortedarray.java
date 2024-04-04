import java.util.Scanner;
public class Checksortedarray {
    //from recursion
    public static boolean sort(int arr[],int index){
        if(index==(arr.length-1))
        {
            return true; 
        }
         if(arr[index]>=arr[index+1])
         {
           return false;
         }
        else{
         return sort(arr,index+1);
        }
    }
    public static void main(String[] args) {
        //from loop
        Scanner s=new Scanner(System.in);
        int n,flag=0;
        System.out.println("enter size of array");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
       
        System.out.println(sort(arr,0));
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1] || arr[i]==arr[i+1])
            {
               flag=1; 
               break;
            }
        }
        if(flag==1)
        {
             System.out.println("not sorted array");
        }
        else{
            System.out.println("sorted array");
        }
        
    }
}
