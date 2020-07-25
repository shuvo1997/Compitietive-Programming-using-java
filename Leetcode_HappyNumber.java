import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Leetcode_HappyNumber {

    static int count=0;
    public static int sum(int num){
        int number = num;
        int sum = 0;
        while(number != 0){
            int rem = number%10;
            sum += rem*rem;
            number /= 10;
        }
   //     System.out.println(sum+"In sumfun");
        return sum;
    }
    public static boolean ishappy(int num){
        TreeSet<Integer> set = new TreeSet<>();
        int sum = sum(num);
        while (true) {
            //System.out.println(set.contains(sum)+" "+set+" "+sum);
            if(sum == 1){
                return true;
            }
            else if (!set.contains(sum)) {
                //System.out.println(sum);
                set.add(sum);
                sum = sum(sum);
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(ishappy(num));


    }
}
