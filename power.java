import java.util.*;
public class power{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int b,e,p;
        System.out.println("enter base and exponent:");
        b=in.nextInt();
        e=in.nextInt();
        p=(int)Math.pow(b,e);
        System.out.println("power is: "+p);
    }
}