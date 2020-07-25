import java.util.LinkedList;
import java.util.Scanner;

public class brakets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            LinkedList<Character> list = new LinkedList<>();
            int unordered = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')' && list.isEmpty()) {
                    unordered++;
                } else if (s.charAt(i) == '(') {
                    list.push(s.charAt(i));
                } else {
                    list.poll();
                }
            }
            //System.out.println(list);
            System.out.println(unordered);
        }
    }
}
