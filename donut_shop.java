import java.util.Scanner;

    public class donut_shop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                int one = sc.nextInt();
                int donuts = sc.nextInt();
                long donuts_cost = sc.nextInt();
                double perdonut = donuts_cost/(double)donuts;
                if(donuts_cost <= one){
                    System.out.println("-1"+" "+donuts);
                }
                else if(perdonut == one){
                    System.out.println("1"+" "+"-1");
                }
                else if(perdonut < one){
                    int ans_a = 1;
                    System.out.println(ans_a+" "+donuts);
                }
                else if(perdonut > one){
                    System.out.println("1 "+"-1");
                }
            }
        }
}
