import java.util.*;
public class natural_recursion
{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n,s=0;
        System.out.println("enter upto which number:");
        n=in.nextInt();
        s=getsum(n);
        System.out.println("Sum of "+n+" natural numbers are: "+s);
    }
    static int getsum(int n)
    {
        if(n==0)
        return 0;
        else
        return n+getsum(n-1);
    }
}