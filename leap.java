import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int y;
        System.out.println("Enter the year:");
        y=in.nextInt();
        if(y%4==0&&y%100!=0)
        System.out.println(y+" is a leap year.");
        else
        System.out.println(y+" is not a leap year.");
    }
}
