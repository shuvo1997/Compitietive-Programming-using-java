import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[n] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                }
            }
        }
    }
}
