import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int k = sc.nextInt();

        int[] atob = new int[n];
        long[] atob1 = new long[n];
        int[] btoc = new int[m];
        long[] btoc1 = new long[m];

        for(int i=0; i<n; i++){
            atob[i] = sc.nextInt();
            atob1[i] = atob[i] + t1;
        }

        for(int i=0; i<m; i++){
            btoc[i] = sc.nextInt();
            btoc1[i] = btoc[i] + t1;
        }

        if(n-k == 0 || m-k ==0){
            System.out.println("-1");
        }

        else {
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){

                }
            }



        }

        for (long i:atob1) {
            System.out.println(i);
        }

        for (long i:btoc1) {
            System.out.println(i);
        }


    }
}
