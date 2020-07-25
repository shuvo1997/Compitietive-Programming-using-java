import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cf_troboulsort {
    int value;
    short type;
    public cf_troboulsort(int value,short type){
        this.value = value;
        this.type = type;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            cf_troboulsort[] arr = new cf_troboulsort[n];
            for (int i = 0; i < n; i++) {
                arr[i].value = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr[i].type = sc.nextByte();
            }
            for (int i = 0; i < n-1; i++) {
                if (arr[i].value > arr[i+1].value){
                    if(arr[i].type != arr[i+1].type){

                    }
                }
            }
        }
    }
}
