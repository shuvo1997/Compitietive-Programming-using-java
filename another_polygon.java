import java.util.Arrays;
import java.util.Scanner;

public class another_polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long othersides = 0;
        for (int i = 0; i < n-1; i++) {
            othersides += arr[i];
        }
        System.out.println((arr[n-1]-othersides)+1);
    }
}
