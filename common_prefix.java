import java.util.Arrays;
import java.util.Scanner;

public class common_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] sortedarr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sortedarr[i] = arr[i];
            }
            Arrays.sort(sortedarr);
            int max = sortedarr[n - 1];

            if (max == 0) {
                char ch = 'a';
                for (int i = 0; i < n+1; i++) {
                    System.out.println(ch);
                    ch++;
                    if ((int) ch > 122) {
                        ch = 'a';
                    }
                }
            } else {
                boolean flag = true;
                for (int i = 0; i < n-1; i++) {
                    if(i== 0 && arr[i] > arr[i+1] && arr[i+1] < arr[i+2]){
                        char ch = 'a';
                        for (int j = 0; j < arr[i]; j++) {
                            System.out.print(ch);
                            ch++;
                            if ((int) ch > 122) {
                                ch = 'a';
                            }
                        }
                        System.out.println();
                        char ch1 = 'a';
                        for (int j = 0; j < arr[i]; j++) {
                            System.out.print(ch1);
                            ch1++;
                            if ((int) ch1 > 122) {
                                ch = 'a';
                            }
                        }
                        System.out.println();
                        i++;
                        //flag = false;
                    }
                    for (int j = 0; j < arr[i]; j++) {
                        System.out.print("a");
                    }
                    System.out.println();
                    if (arr[i] == max && flag) {
                        for (int j = 0; j < arr[i]; j++) {
                            System.out.print("a");
                        }
                        flag = false;
                        System.out.println();
                    }
                }
            }
        }
    }
}
