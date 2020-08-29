import java.util.Scanner;

public class shovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0 ){
            int sticks = sc.nextInt();
            int diamonds = sc.nextInt();
            int ans = 0;
            if(sticks <= 1 && diamonds <= 1){
                System.out.println("0");
            }
            else if(sticks == 0 || diamonds == 0){
                System.out.println("0");
            }
            else if(sticks >= diamonds){
                if(diamonds < sticks/2){
                    ans += diamonds;
                }
                else {
                    ans += sticks/2;
                    if(diamonds-ans >= 3){
                        int rem = diamonds-ans;
                        int again =(int)Math.ceil(rem/2.0);
                        ans -= Math.ceil(again/2.0);
                        ans += (again);
                        //System.out.println(again);
                    }
                }
                System.out.println(ans);
            }
            else if(sticks < diamonds){
                if(sticks < diamonds/2){
                    ans += sticks;
                }
                else {
                    ans += diamonds/2;
                    if(sticks-ans >= 3){
                        int rem = sticks-ans;
                        int again =(int)Math.ceil(rem/2.0);
                        ans -= Math.ceil(again/2.0);
                        ans += (again);
                    }
                }
                System.out.println(ans);
            }

        }
    }
}
