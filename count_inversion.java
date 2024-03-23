import java.util.*;
public class count_inversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,c=0;
        System.out.println("enter size:");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[i]>arr[j])
                c++;
            }
        }
        System.out.println("count inversion of the array is: "+c);
    }
}
