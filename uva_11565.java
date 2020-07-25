import java.util.Scanner;

public class uva_11565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean hasSolve = false;
            int x = -100;int y = -100; int z = -100;
            for (x = -100; x <= 100 && !hasSolve; ++x) {
                for (y = -100; y <= 100 && !hasSolve; ++y) {
                    for (z = -100; z <= 100 && !hasSolve; ++z) {
                        if(x != y && y != z && x != z){
                            if(x+y+z == a && x*y*z == b && (x*x)+(y*y)+(z*z) == c){
                                hasSolve = true;
                                System.out.println(x+" "+y+" "+z);
                            }
                        }
                    }
                }
            }
            if(!hasSolve)
                System.out.println("No solution.");
        }
    }
}
