import java.util.Arrays;
import java.util.Scanner;

public class granny{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag = false;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] <= i + 1) {
                    System.out.println(i + 2);
                    flag = true;
                    break;

                }
            }
            if (!flag)
                System.out.println(1);
        }
    }
}