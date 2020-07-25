import java.util.*;

public class zero_reaminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            long k = sc.nextInt();
            long[] arr = new long[n];
            HashMap<Long,Long> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < k){
                    if(!map.containsKey(k - arr[i])) {
                        map.put(k - arr[i],(long)1);
                    }
                    else {
                        long count = map.get(k-arr[i]) + 1;
                        map.put(k - arr[i],count);
                        map.put((k*count)-arr[i],(long)1);
                       // System.out.println(map);
                    }
                }
                else {
                    double div = Math.ceil(arr[i]/(double)k);
                    long rem = ((long)div*k)-arr[i];
                    //System.out.println(rem);
                    if(!map.containsKey(rem)) {
                        map.put(rem,(long)1);
                    }
                    else if(rem != 0){
                        long count = map.get(rem) + 1;
                        map.put(rem,count);
                        map.put(rem+(k*(count-1)),(long)1);
                    }
                }
            }
            TreeMap<Long,Long> map1 = new TreeMap<>(map);
            //System.out.println(map1);
            if(map1.lastKey() == 0){
                System.out.println(map1.lastKey());
            }
            else {
                System.out.println(map1.lastKey() + 1);
            }
        }

    }
}
