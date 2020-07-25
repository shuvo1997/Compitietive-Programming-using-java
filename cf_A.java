import java.util.ArrayList;
import java.util.Scanner;

public class cf_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                int aele = a[i];
                for (int j = 0; j < m; j++) {
                    if(aele == b[j]){
                        System.out.println("YES");
                        System.out.println("1 "+aele);
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if (flag){
                System.out.println("NO");
            }
        }
    }
}
