import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class completion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            if(n % 2 == 0){
                int temp = n/2;
                System.out.println(temp+" "+temp);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();

                for (int i = 3; i <= Math.sqrt(n); i++) {
                    if(n % i == 0){
                        if(n/i == i)
                            list.add(i);
                        else {
                            list.add(n/i);
                        }
                    }
                }
                //System.out.println(list);
                if(list.size() == 0){
                    System.out.println("1"+" "+(n-1));
                }
                else {
                    list.sort(Comparator.naturalOrder());
                    //System.out.println(list);
                    int item = list.get(list.size()-1);
                    System.out.println(item+" "+(n-item));
                }
            }
        }
    }
}
