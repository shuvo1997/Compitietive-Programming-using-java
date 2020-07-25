import java.util.Scanner;

public class sticks {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            double ans = Math.ceil(n/2.0);
            System.out.println((int)ans);
        }
    }
}
