import java.util.Scanner;

public class cf_pyramid {
    static int pyramid(int height){
        int py = 0;
        for(int i=height; i>0; i--){
            py = py+i;
        }
        return py;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc!=0){
            int n = sc.nextInt();
            System.out.println(pyramid(n));
            tc--;
        }
    }
}
