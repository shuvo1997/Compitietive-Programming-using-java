import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class contest_656_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n*2];
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n*2; i++) {
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n*2; i++) {
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                    list.add(arr[i]);
                }
            }
            //System.out.println(set);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
