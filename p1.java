import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = sc.nextInt();

        long ans;
        if(a == b){
            ans = (long)a+b+2*ab;
            System.out.println(ans);
        }
        else if(a<b){
            ans = (long)a+a+1+2*ab;
            System.out.println(ans);
        }
        else{
            ans = (long)2*b+1+2*ab;
            System.out.println(ans);
        }
    }
}
