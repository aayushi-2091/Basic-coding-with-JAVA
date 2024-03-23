import java.util.*;
public class largest_element {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,max;
        System.out.println("enter size:");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("largest element: "+max);
    }
}
