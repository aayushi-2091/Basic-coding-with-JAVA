import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter a number:");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number: "+n+" is: "+fact);
    }
}
