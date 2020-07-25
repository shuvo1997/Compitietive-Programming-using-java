import java.util.HashSet;
import java.util.Iterator;

public class LeetCode_singlenumber {
    public static void main(String[] args) {
        int[] arr = {2,1,2,1,3,4,5,5,4};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                set.remove(arr[i]);
            }
        }
        Iterator<Integer> ie = set.iterator();
        System.out.println(ie.next());
    }
}
