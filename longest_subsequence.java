import java.util.*;
public class longest_subsequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,c=1;
        System.out.println("enter size: ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
                break;
            if(Math.subtractExact(arr[i+1],arr[i])==1)
                c++;
        }
        System.out.println("The  consecutive largest subsequence is: "+c);
    }
}
