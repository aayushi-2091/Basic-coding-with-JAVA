import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,p,s=0,x;
        System.out.println("Enter a number: ");
        n=in.nextInt();
        x=n;
        while(n>0)
        {
            p=n%10;
            s=s+p;
            n=n/10;
        }
        n=x;
        System.out.println("sum of digits of "+n+" is: "+s);
    }
}
