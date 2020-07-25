import java.util.Scanner;

public class codeforces_subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        String s = "codeforces";
        String code = "";
        String forces = "";
        String ss = "";
        for(int i=0; i<100000; i++){
            code += "code";
        }
        for(int i=0; i<100000; i++){
            forces += "forces";
        }
        for (int i = 0; i < 10000; i++) {
            ss += "s";
        }
        System.out.println(code+forces+ss);

//        if(k > 10) {
//            long log10 = (long) Math.log10(k);
//            double log2 = Math.log10(2);
//            double log2n = log10/log2;
//            myk = (long) Math.ceil(log2n);
//            System.out.println(myk);
//            myk = myk/10;
//            while (myk-- > 0) {
//                s = s.replaceAll("s","ss");
//            }
//            System.out.println(s);
//        }else {
//            while (k-- > 0){
//                s = s+"s";
//            }
//            System.out.println(s);
//        }
    }
}