import java.util.*;
public class array_reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("reverse is:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
