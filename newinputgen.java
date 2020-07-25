import java.util.Scanner;

public class newinputgen {
    public static void main(String[] args) {
        int n = 70;
        Scanner sc = new Scanner(System.in);
        String[] name = sc.nextLine().split(" ");
        for(String i : name){
            System.out.println(i);
        }
    }
}
