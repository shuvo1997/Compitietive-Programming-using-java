import java.util.Scanner;
import java.util.TreeSet;

public class cf_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc != 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] contests = new int[n];
            TreeSet<Integer> set = new TreeSet<>();

            for(int i=0; i < contests.length; i++){
                contests[i] = sc.nextInt();
                set.add(contests[i]);
            }
            int count=0;
            int rem = x;
            for(int i=1; i<=n+x; i++){
                if(set.contains(i)){
                    count++;
                }
                else if(rem == 0){
                    //System.out.println(rem);
                    break;
                }
                else{
                   // System.out.println(rem+" "+i);
                    rem--;
                    count++;
                }
            }
            System.out.println(count);
            tc--;
        }
    }
}
