import java.util.ArrayList;
import java.util.Scanner;

public class makeitgood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> numbers = new ArrayList<>();
            boolean[] flags = new boolean[n-1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                if(arr[i] < arr[i+1]){
                    flags[i] = true;
                }
                else
                    flags[i] = false;
            }
            boolean flag = false;
            boolean another_fuck = false;
            int index = 0;
            for (int i = n-2; i > 0; i--) {
                if(flags[i]){
                    if(flags[i]){

                    }
                }
                if(flags[i] && !flags[i-1] && !flag){
                    flag = true;
                    index = i;
                    //System.out.println(index);
                }
            }
            if(!flag){
                System.out.println("0");
            }
            else if(!another_fuck && index != 0){
                System.out.println(index);
            }
        }
    }
}
