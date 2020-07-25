import java.util.Scanner;

public class cf_phonix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc!=0){
            int n = sc.nextInt();
            int tot = 1 << n;
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = 1 << (i+1);
            }
            long pile1 = 0;
            long pile2 = 0;
            for(int i=0; i<(arr.length/2)-1; i++){
                pile1 += arr[i];
            }
            pile1 += arr[arr.length-1];
            for (int i=arr.length-2; i>=(arr.length/2)-1; i--){
                pile2 += arr[i];
            }
//            System.out.println(pile1);
//            System.out.println(pile2);
            System.out.println(pile1-pile2);
            tc--;
        }
    }
}
