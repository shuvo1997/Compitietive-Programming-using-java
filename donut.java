import java.util.Scanner;

public class donut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int eachdonut = sc.nextInt();
            int boxdonut = sc.nextInt();
            int boxcost = sc.nextInt();
            double boxdonutcost = boxcost/(double)boxdonut;
            if(boxcost <= eachdonut) {
                System.out.println("-1" + " " + boxdonut);
            }
            else if (eachdonut == boxdonutcost){
                System.out.println("1"+" "+"-1");
            }
            else if(eachdonut > boxdonutcost){
                for (int i = 2; i <= boxdonut; i++) {
                    if(i*eachdonut >= boxcost){
                        System.out.println(i-1+" "+i);
                        break;
                    }
                }
            }
        }
    }
}
