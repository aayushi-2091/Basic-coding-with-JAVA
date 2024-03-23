import java.util.*;
public class remove_space {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.println("enter a string:");
        str=in.nextLine();
        str=str.replace(" ", "");
        System.out.println("string after removing space is:"+str);
    }
}
