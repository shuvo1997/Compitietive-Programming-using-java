import java.util.Scanner;

public class vanilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long va = sc.nextLong();
            long ch = sc.nextLong();
            long first = sc.nextLong();
            long second = sc.nextLong();
            if (va > ch) {
                if (va - first >= 0 && ch - second >= 0) {
                    System.out.println("Yes");
                } else{
                    long diff = va - ch;
                    va -= diff;
                    second -= diff;
                    if (ch - first >= 0 && va - second >= 0) {
                        System.out.println("Yes");
                    }
                    else
                        System.out.println("No");
                }
            } else {
                if (ch - first >= 0 && va - second >= 0) {
                    System.out.println("Yes");
                } else{
                    long diff = ch - va;
                    ch -= diff;
                    first -= diff;
                    if (va - first >= 0 && ch - second >= 0) {
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                        }
                }
            }
        }
    }
}
