import java.util.*;
public class anagram{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String st="", st1="";
        System.out.println("Enter a string");
        st=in.nextLine();
        System.out.println("Enter another string");
        st1=in.nextLine();
        if(st.length()!=st1.length())
        System.out.println("It is not a anagram string.");
        else{
            char[] string1 = st.toCharArray();  
            char[] string2 = st1.toCharArray(); 
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }
    }
}