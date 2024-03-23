import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,gcd=1;
        System.out.println("Enter 2 nos.");
        x=in.nextInt();
        y=in.nextInt();
        for(int i=1;i<=x&&i<=y;i++)
        {
            if(x%i==0&&y%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("The GCD of 2 numbers: "+x+" and "+y+" is: "+gcd);
    }
}
