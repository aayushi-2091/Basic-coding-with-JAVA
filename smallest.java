import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,min;
        System.out.println("enter size");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elemnets:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("the smallest element is: "+min);
    }
}
