import java.util.Scanner;

public class Educational_91A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < n && (b == 0 || c == 0); i++) {
                a = arr[i];
                for (int j = i + 1; j < n; j++) {
                    if (a < arr[j]) {
                        b = arr[j];
                        for (int k = j + 1; k < n; k++) {
                            if (b > arr[k]) {
                                c = arr[k];
                                System.out.println("YES");
                                System.out.println((i+1) + " " + (j+1) + " " + (k+1));
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            if(b == 0 || c == 0) {
                System.out.println("NO");
            }
        }
    }
}
