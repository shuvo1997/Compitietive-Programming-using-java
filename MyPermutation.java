import java.util.Arrays;
import java.util.Scanner;

public class MyPermutation {
    private static void reverse(char[] arr, int st, int end){
        while (st<end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    private static void next_permutation(char[] arr){
        int p = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                p = i;
                break;
            }
        }
        if(p == -1){
            System.out.println("No successor");
            return;
            }
        int q = arr.length-1;
        for(int i=arr.length-1; i>= p+1; i--){
            if(arr[i] > arr[p]){
                q = i;
                break;
            }
        }
        char temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        reverse(arr,p+1,arr.length-1);
        for(char a : arr) {
            System.out.print(a);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            String s = sc.next();
            if(s.contains("#")){
                break;
            }
            char[] kar = s.toCharArray();
            next_permutation(kar);
        }
    }
}
