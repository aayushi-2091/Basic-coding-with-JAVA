import java.util.*;
public class fibonacci_series {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n,a=0,b=1,c=0;
        System.out.println("Enter the nth term:");
        n=in.nextInt();
        System.out.println("The fibonacci series is:");
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
