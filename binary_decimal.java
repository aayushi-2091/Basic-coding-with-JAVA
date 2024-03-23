import java.util.*;
public class binary_decimal
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,p,c=-1,s=0;
        System.out.println("enter binary number");
        n=in.nextInt();
        while(n>0)
        {
            p=n%10;
            c++;
            if(p!=0)
            {
                s+=1*(int)Math.pow(2,c);
            }
            n=n/10;
        }
        System.out.println("Decimal equivalent is: "+s);
    }
}