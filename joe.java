import java.util.Scanner;

public class joe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        double dollar = 0;
        for (int i = 0; i < s; i++) {
            dollar += 1.0/(i+1);
        }
        System.out.println(dollar);
    }
}
