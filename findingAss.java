import java.util.Scanner;

public class findingAss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int assnum = 20;
            int j = assnum % 10 + 4;
            int receivedate = 3;
            int k = receivedate + 10;
            int submit = sc.nextInt();
            int l = submit + 10;
            int m = 18;
            int n = j + k + l + m;
            int o = (n % 5) + 2;

            System.out.println("J = "+j);
            System.out.println("K = "+k);
            System.out.println("L = "+l);
            System.out.println("M = "+m);
            System.out.println("N = "+n);
            System.out.println("O = "+o);
            System.out.println("N = "+n);

            int probnum = n % 18;
            System.out.println("Problem Number: "+probnum);
        }
    }
}