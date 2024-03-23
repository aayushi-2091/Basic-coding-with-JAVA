import java.util.*;
public class perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,s=0;
        System.out.println("Enter a number:");
        x=in.nextInt();
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            {
                s=s+i;
            }
        }
        if(s==x)
        System.out.println("It is a perfect number.");
        else
        System.out.println("It is not a perfect number.");
    }
}
