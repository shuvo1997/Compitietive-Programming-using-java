import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class HackerRank_maxele {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxim = 0;
        int count=0;
        while(tc != 0){
            String[] que = br.readLine().split(" ");
            if(que[0].contains("1")){
                int k = Integer.parseInt(que[1]);
                list.add(k);
                //System.out.println(list);
                map.put(k,map.getOrDefault(k,0)+1);
                //System.out.println(map);
                maxim = Math.max(maxim,k);
                System.out.println(map.keySet());
            }
            else if(que[0].contains("2")){
                int k = list.pollLast();
                //System.out.println(k);
                map.put(k,map.get(k)-1);
                //System.out.println(map);
                if(map.get(k) == 0 && k == maxim){
                    maxim = 0;
                    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                        if(entry.getValue() != 0){
                            maxim = Math.max(maxim,entry.getKey());

                        }
                    }
                }
            }
            else{
                System.out.println(maxim);
            }
            tc--;
        }
    }
}
