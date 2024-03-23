import java.util.*;
public class matrix_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r,c;
        System.out.println("enter rows and columns: ");
        r=in.nextInt();
        c=in.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.println("enter elements in 1st matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("enter elements in 2nd matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of 2 matrices: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
