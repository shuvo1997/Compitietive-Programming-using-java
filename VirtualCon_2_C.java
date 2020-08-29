import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualCon_2_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0 ){
            StringBuilder sb = new StringBuilder(sc.next());
            char ch1 = sb.charAt(0);
            char ch2 = sb.charAt(sb.length()-1);
            String s = "";
            StringBuilder sb1 = new StringBuilder(sb);
            sb1.delete(0,1);
            sb1.append(ch1);
            s += ch2;
            for (int i = 0; i < sb.length()-1; i++) {
                s += sb.charAt(i);
            }
            System.out.println(sb1);
            System.out.println(s);
            if(sb1.toString().equals(s)){

                System.out.println("0");
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                String[] numbers = sb.toString().split("");
                Arrays.sort(numbers);
                for (int i = 0; i < numbers.length-1; i++) {
                    if(numbers[i] != numbers[i+1]){
                        list.add(i+1);
                    }
                }
                System.out.println(list);
            }
        }
    }
}
