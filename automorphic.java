import java.util.*;
public class automorphic{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,c=0,sq,s=0,x=1,y;
        System.out.println("Enter a number:");
        n=in.nextInt();
        y=n;
        while(n>0)
        {
            int p=n%10;
            c++;
            n=n/10;
        }
        n=y;
        sq=n*n;
        for(int i=0;i<c;i++)
        {
            int p=sq%10;
            s=(p*x)+s;
            x=x*10;
        }
        if(n==s)
        System.out.println("Automorphic number.");
        else
        System.out.println("Not a automorphic number.");
    }
}