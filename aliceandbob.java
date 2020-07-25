import java.util.Scanner;

public class aliceandbob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            StringBuilder sb = new StringBuilder(sc.next());
            int count = 0;
            for (int i = 0; i < sb.length()-1; ) {
                if(sb.charAt(i) != sb.charAt(i+1)){
                    sb.delete(i,i+2);
                    count++;
                    if(i>0){
                        i--;
                    }
                    //System.out.println(sb+" "+sb.length()+" "+i);
                    continue;
                   //ystem.out.println(count);
                }
                i++;
            }
            if(count == 0){
                System.out.println("NET");
            }
            else if(count % 2 == 1){
                System.out.println("DA");
            }
            else {
                System.out.println("NET");
            }
        }
    }
}
//        3
//        01
//        1111
//        0011
