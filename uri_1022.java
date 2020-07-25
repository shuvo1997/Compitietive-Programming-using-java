import java.util.Scanner;

public class uri_1022 {
    private static int gcd(int a,int b){
        int rem;
        while(b != 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        while(tc != 0){
            String exp = sc.nextLine();
            String[] str = exp.split(" ");

            int n1 = Integer.parseInt(str[0]);
            int d1 = Integer.parseInt(str[2]);
            int n2 = Integer.parseInt(str[4]);
            int d2 = Integer.parseInt(str[6]);

            //System.out.println(str[3]);

            if(str[3].contains("+")){
                int n = (n1*d2)+(n2*d1);
                int d = (d1*d2);
                int rem = gcd(n,d);
                //System.out.println(rem);
                System.out.println(n+"/"+d+" = "+(n/rem)+"/"+(d/rem));
            }
            else if(str[3].contains("-")){
                int n = (n1*d2)-(n2*d1);
                int d = (d1*d2);
                int rem = Math.abs(gcd(n,d));
               // System.out.println(rem);
                System.out.println(n+"/"+d+" = "+(n/rem)+"/"+(d/rem));
            }
            else if(str[3].contains("*")){
                int n = (n1*n2);
                int d = (d1*d2);
                int rem = gcd(n,d);
                //System.out.println(rem);
                System.out.println(n+"/"+d+" = "+(n/rem)+"/"+(d/rem));
            }
            else if(str[3].contains("/")){
                int n = (n1*d2);
                int d = (n2*d1);
                int rem = gcd(n,d);
                //System.out.println(rem);
                System.out.println(n+"/"+d+" = "+(n/rem)+"/"+(d/rem));
            }
            tc--;
        }
    }
}
