import java.util.Scanner;

public class hawai_misti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int totalmisti = n;
            int bonusmisti = n;
            int round = 1;
            while (true){
                bonusmisti = bonusmisti/k;
                if (bonusmisti <= 0){
                    break;
                }
                if(round%2 != 0)
                    bonusmisti++;
                else
                    bonusmisti--;
                //System.out.println(bonusmisti);
                totalmisti += bonusmisti;
                round++;
            }
            System.out.println("Total Number of Hawai Misti is : "+totalmisti);
        }
    }
}
