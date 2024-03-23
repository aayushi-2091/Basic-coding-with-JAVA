import java.util.*;
public class factorial_recursion{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,f;
        System.out.println("enter a number:");
        n=in.nextInt();
        f=fact(n);
        System.out.println("factorial of "+n+" is: "+f);
    }
    static int fact(int n)
    {
        if(n==0)
        return 1;
        else
        return n*fact(n-1);
    }
}