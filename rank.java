import java.util.*;
public class rank {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("enter the size of the array:");
        n=in.nextInt();
        int arr[]=new int[n];
        int copiedarr[]=new int[n];
        System.out.println("enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        copiedarr=Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(copiedarr);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==copiedarr[j])
                {
                    arr[i]=j+1;
                    break;
                }
            }
        }
        System.out.println("The array after replacing elements according to their rank:");
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
