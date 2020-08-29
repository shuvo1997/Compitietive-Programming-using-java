import java.util.Scanner;

public class Arrival_of_the_general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = -1;
        int min = 101;
        int max_index = -1;
        int min_index = -1;
        int seconds = 0;
        for (int i = 0; i < n; i++) {
            if(max <= arr[i]){
                max = arr[i];
                max_index = i;
            }
            if(min >= arr[i]){
                min = arr[i];
                min_index = i;
            }
        }
        if(max_index == n-1 || min_index == 0){
            seconds--;
        }
        seconds += max_index+((n-1)-min_index);
        System.out.println(seconds);
//        System.out.println(min_index+" "+min);
//        System.out.println(max_index+" "+max);

    }
}
