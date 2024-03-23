import java.util.Scanner;

public class fibonacci_recursion {
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n,s;
        System.out.println("Enter the nth term:");
        n=in.nextInt();
        System.out.println("the fibonacci series is:");
        for(int i=0;i<n;i++)
        {
            s=fibo(i);
            System.out.print(s+" ");
        }
     }
     static int fibo(int n)
     {

        if(n<=1)
        return n;
        return fibo(n-1)+fibo(n-2);
     }
}
