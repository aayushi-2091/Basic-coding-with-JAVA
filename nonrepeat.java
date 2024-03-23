import java.util.*;

public class nonrepeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter size:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Non-repeating elements are:");

        boolean isRepeated;

        for (int i = 0; i < n; i++) {
            isRepeated = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

