import java.util.Scanner;

public class jumpy {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        long jump = 0;
        String str = "";
        if(x1>x2 && v1>v2){
            str = "NO";
        }
        else if(x2>x1 && v2>v1){
            str = "NO";
        }
        else{
            while(jump < 10001){
                long dist1 = jump*v1+x1;
                long dist2 = jump*v2+x2;

                if(dist1 == dist2){
                    str = "YES";
                    break;
                }
                else if(jump == 10000 && dist1 != dist2){
                    str = "NO";
                }
                jump++;
            }
         //   str = "NO";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //String[] strings = sc.nextLine().split(" ");
            int x1 = sc.nextInt();
            int v1 = sc.nextInt();
            int x2 = sc.nextInt();
            int v2 = sc.nextInt();
            System.out.println(kangaroo(x1, v1, x2, v2));
        }
    }
}
