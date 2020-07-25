import java.util.Scanner;

public class keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        int vks = 0;
        boolean flag = true;
        for (int i = 0; i < s.length()-1; ) {
            if(s.charAt(i) == 'V' && s.charAt(i+1) == 'K'){
                vks++;
                s.replace(i,i+2,"XX");
                //System.out.println(s);
                i = i+2;
                continue;
            }
            i++;
        }
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == 'V' && s.charAt(i+1) == 'V' && flag){
                vks++;
                flag = false;
            }
            if (s.charAt(i) == 'K' && s.charAt(i+1) == 'K' && flag){
                vks++;
                flag = false;
            }
        }
        System.out.println(vks);
    }
}
