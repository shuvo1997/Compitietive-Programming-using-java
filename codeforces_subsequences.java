import java.util.Scanner;

public class codeforces_subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        String s = "codeforces";
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = 1;
        }
        long multi = 1;
        int i=0;
        while (k > multi){
            arr[i]++;
            i++;
            if(i > arr.length-1){
                i = 0;
            }
            multi = 1;
            for (int j = 0; j < 10; j++) {
                multi *= arr[j];
            }
            //System.out.println("Multi"+multi);
        }
        String codeforces = "";
        for (int j = 0; j < 10; j++) {
            int seq = arr[j];
            while (seq != 0){
                codeforces += s.charAt(j);
                seq--;
            }
        }
        System.out.println(codeforces);
    }
}
