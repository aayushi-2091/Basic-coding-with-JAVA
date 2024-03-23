import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,s=0,x,P;
        System.out.println("Enter a number: ");
        n=in.nextInt();
        x=n;
        while(n>0)
        {
            P=n%10;
            s=s+(int)Math.pow(P,3);
            n=n/10;
        }
        n=x;
        if(n==s)
        System.out.println("Armstrong no.");
        else
        System.out.println("Not a armstrong no.");
    }
}
