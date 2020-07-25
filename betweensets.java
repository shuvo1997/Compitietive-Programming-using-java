import java.util.Scanner;

public class betweensets {
    static int getTotalX(int[] a, int[] b) {
        int count = 0;
        int num = a[a.length-1];


        while (num <= b[0]) {
            int n = a.length-1;
            int m = b.length-1;
            boolean flag = true;
            boolean flag1 = true;

            while (n >= 0) {
                if(num % a[n] != 0){
                    flag = false;
                }
                n--;
            }
            if(flag) {
                while (m >= 0) {
                    if (b[m] % num != 0) {
                        flag1 = false;
                    }
                    m--;
                }
                if(flag1){
                    count++;

                }
            }
            num++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = scanner.nextInt();
        }

        System.out.println(getTotalX(a,b));
    }
}
