import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class rationalee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
//            int[] integers = new int[n];
//            int[] friends = new int[k];
            ArrayList<Integer> integers = new ArrayList<>();
            ArrayList<Integer> friends = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                //integers[i] = sc.nextInt();
                integers.add(sc.nextInt());
            }
            for (int i = 0; i < k; i++) {
//                friends[i] = sc.nextInt();
                friends.add(sc.nextInt());
            }
            integers.sort(Comparator.naturalOrder());
            friends.sort(Comparator.naturalOrder());
//            Arrays.sort(integers);
//            Arrays.sort(friends);
            long maxhappy = 0;
//            int count = integers.length;
//            int countfromfirst = 0;
            for (int i = 0; i < friends.size(); i++) {
                if(friends.get(i) == 1){
                    maxhappy += 2*integers.remove(integers.size()-1);
                }
                else {
                    int j = integers.size()-1;
                    int itemstoremove = friends.get(i);
                    while (j != 1){
                        if(integers.get(j) != integers.get(j-1)) {
                            maxhappy += integers.remove(j);
                            itemstoremove--;
                        }
                        j--;
                    }

                }
            }
            System.out.println(maxhappy);
        }
    }
}
