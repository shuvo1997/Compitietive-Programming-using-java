import java.util.Scanner;

public class pari_nai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < 200; i++) {
                s.append("a");
            }
            System.out.println(s);
            for (int i = 0; i < n; i++) {
                if(s.charAt(arr[i]) == 'a') {
                    s.replace(arr[i], arr[i] + 1, "b");
                }
                else {
                    s.replace(arr[i], arr[i] + 1, "a");
                }
                System.out.println(s);
            }
        }
    }
}
