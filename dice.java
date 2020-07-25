import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int awins = 0;
        int bwins = 0;
        int draw = 0;
        for (int i = 0; i < 6; i++) {
            int adiff = Math.abs(a-(i+1));
            int bdiff = Math.abs(b-(i+1));
            if(adiff < bdiff){
                awins++;
            }
            else if(adiff > bdiff){
                bwins++;
            }
            else
                draw++;
        }
        System.out.println(awins+" "+draw+" "+bwins);
    }
}
