import java.util.*;
public class rotation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,key,temp;
        System.out.println("Enter  size:");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("no. of rotations: ");
        int k=in.nextInt();
        for(int c=0;c<k;c++)
        {
            key=arr[0];
            for(int i=1;i<n;i++)
            {
                temp = arr[i];
                arr[i] = key;
                key = temp;
            }
            arr[0]=key;
        }
        System.out.println("The array after "+k+" rotations:");
        for(int l=0;l<n;l++)
        {
            System.out.print(arr[l]+" ");
        }
    }
}
