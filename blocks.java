import java.util.ArrayList;
import java.util.Scanner;

public class blocks {
    static void chud(StringBuilder s,int i){
        if(s.charAt(i) == 'B'){
            s.replace(i,i+1,"W");
        }
        else {
            s.replace(i,i+1,"B");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(sc.next());
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 0;
        char ch = 'W';
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == 'B'){
                b++;
            }
            else {
                a++;
            }
        }
        if(a%2 == 1 && b%2 == 0){
            ch = 'B';
        }

        if(a == 0 || b == 0){
            System.out.println("0");
        }
        else if((a % 2 == 0 && b % 2 == 0) || (a%2 == 0 && b%2 == 1) || (a%2 == 1 && b%2 == 0)){
            int i = 0;
            while (true){
                int whi = 0;
                for (int j = 0; j < sb.length(); j++) {
                    if(sb.charAt(j) == ch){
                        whi++;
                    }
                }
                if(whi == 0){
                    break;
                }
                if(i >= sb.length()){
                    i = 0;
                }
                if(sb.charAt(i) == ch){
                    chud(sb,i);
                    chud(sb,i+1);
                    list.add(i);
                    i = 0;
                }
                i++;
                //System.out.println(sb);
            }
            System.out.println(list.size());
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j)+1+" ");
            }
        }
        else {
            System.out.println("-1");
        }
    }
}
