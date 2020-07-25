import java.util.Scanner;

public class inputGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        //int o = Integer.valueOf(sc.nextLine()) ;
        String[] nam = sc.nextLine().split(" ");

        int[] namnum;
        int nams = 0;
        for (String k : nam) {
            nams += k.length();
        }
        namnum = new int[nams];
        int op = 0;
        //int[] pages = new int[n] ;
        int temp;
        for (String s : nam) {
            for (int i = 0; i < s.length(); i++) {
                temp = Character.getNumericValue(s.charAt(i)) - 9;
                if (temp < 10) {
                    namnum[op] = temp;
                } else {
                    namnum[op] = temp % 10;
                }
                op++;
            }
        }
//        for (int b : namnum) {
//            System.out.println(b);
//        }
        int i, z;
        i = z = 0;
        while ((i < n)) {
            for (z = 0; z < nams; z++) {
                System.out.println(i + " " + namnum[z]);
                i += 1 ;
                if(i >= n) {
                    break ;
                }
            }


        }
    }
}
