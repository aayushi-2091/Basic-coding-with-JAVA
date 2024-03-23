import java.util.*;
public class frequency{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="";
        int c=1;
        System.out.println("Enter a word:");
        str=in.nextLine();
        int l=str.length();
        int ch[]=new int[l];
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                c++;
            }
        ch[i]=c;
        }
        for(int k=0;k<l;k++)
        {
            System.out.println("The frequency of "+ str.charAt(k) + "-" + ch[k]);
        }
    }
}