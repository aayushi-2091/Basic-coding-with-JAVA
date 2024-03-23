import java.util.*;
public class longpalin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String wd="";
        int n,max=0;
        System.out.println("enter size");
        n=in.nextInt();
        in.nextLine();
        String str[]=new String[n];
        System.out.println("the words are:");
        for(int i=0;i<n;i++)
        {
            str[i]=in.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            wd=str[i];
            int l=wd.length();
            if(l>max)
            {
                max=l;
                System.out.println("The longest palindrome word is: "+wd+" with length: "+l);
            }
           
        }
    }
}
