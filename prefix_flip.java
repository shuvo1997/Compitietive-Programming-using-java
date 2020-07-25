import java.util.ArrayList;
import java.util.Scanner;

public class prefix_flip {
    static void flip(StringBuilder sb, int len,char ch){
        for (int i = 0; i < len; i++) {
            sb.replace(i,i+1, String.valueOf(ch));

        }
        //System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            StringBuilder a = new StringBuilder(sc.next());
            StringBuilder b = new StringBuilder(sc.next());
            ArrayList<Integer> list = new ArrayList<>();
            int len = 0;
            if(n == 1){
                System.out.print("1 1");
                System.out.println();
            }
            else if(!a.toString().equals(b.toString())) {
                for (int i = 0; i < n; ) {
                    for (int j = i + 1; j < n; j++) {
                        if (a.charAt(i) != a.charAt(j)) {
                            flip(a, j, a.charAt(j));
                            len = j;
                            list.add(j);
                        }
                    }
                    //System.out.println(i);
                    i = i + len;
                    //System.out.println(a);
                }
                for (int i = n - 1; i >= 0; ) {
                    flip(a, i + 1, b.charAt(i));
                    for (int j = i-1; j > 0; j--) {
                        if(b.charAt(i) != b.charAt(j)){
                            i = j-1;
                        }
                    }

                    list.add(i + 1);
                    //System.out.println(a);

                }
                System.out.println(a);
                System.out.print(list.size() + " ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }
            else {
                System.out.println("0");
            }
        }
    }
}
