import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, temp;
        System.out.println("Enter size:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted array in ascending order is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
