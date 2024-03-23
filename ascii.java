import java.util.*;
public class ascii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch;
        System.out.println("Enter a character:");
        ch=in.next().charAt(0);
        System.out.println("ASCII value of "+ch+" is: "+(int)ch);
    }
}
