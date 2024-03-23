import java.util.*;
public class replace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="",st="",st1="";
        System.out.println("Enter a sentence:");
        str=in.nextLine();
        System.out.println("Enter the word you want to replace:");
        st=in.nextLine();
        System.out.println("Enter the word you want in replacement:");
        st1=in.nextLine();
        String replace=str.replace(st, st1);
        System.out.println("The replaced string is: "+ replace);
    }
}
