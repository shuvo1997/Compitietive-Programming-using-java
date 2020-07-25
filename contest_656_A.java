import java.util.Scanner;

public class contest_656_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x != y && y != z && z != x){
                System.out.println("NO");
            }
            else if (x == y && y == z && z == x){
                System.out.println("YES");
                System.out.println(x+" "+y+" "+z);
            }
            else if (x == y){
                if(z < x){
                    System.out.println("YES");
                    System.out.println(x+" "+z+" "+z);
                }
                else
                    System.out.println("NO");
            }
            else if (y == z){
                if(x < y){
                    System.out.println("YES");
                    System.out.println(x+" "+y+" "+x);
                }
                else
                    System.out.println("NO");
            }
            else if (z == x){
                if(y < x){
                    System.out.println("YES");
                    System.out.println(x+" "+y+" "+y);
                }
                else
                    System.out.println("NO");
            }
        }

    }
}
