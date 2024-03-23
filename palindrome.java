import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String st="",st1="";
        System.out.println("Enter a string");
        st=in.nextLine();
        for(int i=st.length()-1;i>=0;i--)
        {
            char ch=st.charAt(i);
            st1=st1+ch;
        }
        if(st.equals(st1))
        System.out.println("It is a palindrome string.");
        else
        System.out.println("It is not a palindrome string.");
    }
}
