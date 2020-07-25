import java.util.Scanner;

public class lights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long cells = n*m;
            if(cells%2 == 0){
                System.out.println(cells/2);
            }
            else {
                int lights =(int) (cells/2)+1;
                System.out.println(lights);
            }
        }
    }
}
