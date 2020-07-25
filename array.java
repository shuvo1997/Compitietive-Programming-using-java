import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = -1;
        int[][] arr = new int[6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                sum = arr[i][j];
            }
        }

    }
}
