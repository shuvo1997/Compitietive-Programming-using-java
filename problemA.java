import java.util.Scanner;

public class problemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();
            int count = 0;
            while (a <= n && b <= n){
                if(a > b){
                    b += a;
                }
                else {
                    a += b;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
