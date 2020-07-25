import java.util.Scanner;

public class left_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rot = sc.nextInt();
        int[] arr = new int[n];
        int[] solve = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int index = i-rot;
            if(index < 0){
                index += n;
                solve[index] = arr[i];
            }
            else {
                solve[index] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(solve[i]+" ");
        }
    }
}
