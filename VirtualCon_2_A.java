import java.util.Scanner;

public class VirtualCon_2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            long lar = 2*l;
            if(lar > r){
                System.out.println("-1 -1");
            }
            else {
                System.out.println(l+" "+lar);
            }
        }

    }
}
