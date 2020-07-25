import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            long n = sc.nextInt();
            int count = 0;
            while (n != 1){
//                if(n == 2 || n % 4 == 0 || n % 5 == 0 || n % 7==){
//                    System.out.println("-1");
//                    break;
//                }
                if(n % 6 == 0){
                    n /= 6;
                }
                else if(n % 6 == 3) {
                    n *= 2;
                }
                else{
                    count = -1;
                    break;
                }
                count++;
            }
            System.out.println(count);
        }

    }
}
