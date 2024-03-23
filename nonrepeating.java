import java.util.Scanner;

public class nonrepeating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        
        System.out.println("Enter a word:");
        str = in.nextLine();
        int l = str.length();
        boolean isRepeated;

        System.out.println("Non-Repeating characters are:");

        for (int i = 0; i < l; i++) {
            isRepeated = false;

            for (int j = 0; j < l; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
