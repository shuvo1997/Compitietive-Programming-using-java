import java.util.Arrays;
import java.util.Scanner;

public class VirtualCon_2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int z = sc.nextInt();
            int[] arr = new int[n];
            int[] cp_arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                cp_arr[i] = arr[i];
            }
            Arrays.sort(cp_arr);
            int max = cp_arr[n-1];
            long sum = 0;
            if(z == 0){
                for (int i = 0; i < k; i++) {
                    sum += arr[i];
                }
                System.out.println(sum);
            }
            else{
                int max_so_far = 0;
                for (int i = 0; i < n; i++) {
                    if(arr[i] > max_so_far){
                        max_so_far = arr[i];
                    }
                    if(arr[i] == max_so_far && i == k-z){

                    }
                    sum += arr[i];
                }
            }
        }
    }
}
