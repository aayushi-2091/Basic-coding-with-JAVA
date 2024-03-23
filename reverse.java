import java.util.*;
public class reverse
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,x,p,sum=0;
        System.out.println("Enter a number:");
        n=in.nextInt();
        x=n;
        while(n>0)
        {
            p=n%10;
            sum=(sum*10)+p;
            n=n/10;
        }
        n=x;
        System.out.println("Reverse of the number "+n+" is: "+sum);
    }
}