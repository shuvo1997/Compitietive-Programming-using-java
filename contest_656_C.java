import java.util.ArrayList;
import java.util.Scanner;

public class contest_656_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int first = arr[0];
            int last = arr[n-1];
            int minele = Math.min(first,last);
            int index = 0;
            boolean flag = false;
            for (int i = 1; i < n-1; i++) {
                if(arr[i] <= minele){
                    index = i;
                    System.out.println(i+1);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("0");
            }
        }
    }
}
