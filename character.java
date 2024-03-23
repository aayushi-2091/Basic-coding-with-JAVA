import java.util.*;
public class character{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch,c;
        System.out.println("enter a character: ");
        ch=in.next().charAt(0);
        System.out.println("Converting to Uppercase letter...");
        c=Character.toUpperCase(ch);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        System.out.println(c+" is a vowel.");
        else
        System.out.println(c+" is a consonant.");
    }
}