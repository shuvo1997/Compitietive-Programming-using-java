import java.util.Scanner;

public class fuchuk_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean allone = true;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] != 1){
                    allone = false;
                    index = i;
                    break;
                }
            }
            if(allone){
                if(n % 2 == 0){
                    System.out.println("Second");
                }
                else {
                    System.out.println("First");
                }
            }
            else {
                if((index+1) % 2 != 0){
                    System.out.println("First");
                }
                else {
                    System.out.println("Second");
                }
            }
        }
    }
}
