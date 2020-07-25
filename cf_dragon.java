import java.util.Scanner;

public class cf_dragon {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc != 0){
            int hitpoint = sc.nextInt();
            int absorb = sc.nextInt();
            int strike = sc.nextInt();

            if(hitpoint <= strike*10){
                System.out.println("YES");
            }
            else {
                while (absorb != 0) {
                    hitpoint = hitpoint >> 1;
                    hitpoint += 10;
                    absorb--;
                }
                hitpoint = hitpoint - strike * 10;


                if (hitpoint <= 0) {
                   // System.out.println(hitpoint);
                    System.out.println("YES");
                } else {
                   // System.out.println(hitpoint);
                    System.out.println("NO");
                }
            }
            tc--;
        }
    }
}
