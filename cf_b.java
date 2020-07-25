import java.util.Scanner;

public class cf_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean kejitbe = true;
//            if(arr[0] == 1 && arr[1] == 1 && arr[2] == 2 && arr[3] == 1){
//                System.out.println("First");
//            }
            //else {
                for (int i = 0; i < n; ) {
                    if ((n - i) % 2 == 0 && kejitbe && arr[i] > 0) {
                        //First player
                        if (arr[i] > 1) {
                            //System.out.println("Ak komse");
                            arr[i] = 1;
                            kejitbe = false;
                        } else {
                            arr[i] = 0;
                            i++;
                            kejitbe = false;
                        }
                    }
                    if ((n - i) % 2 == 0 && !kejitbe && arr[i] > 0) {
                        //Second player
                        if (arr[i] > 1) {
                            arr[i] = 1;
                            kejitbe = true;
                        } else {
                            //System.out.println("ak komse");
                            arr[i] = 0;
                            i++;
                            kejitbe = true;
                        }
                    }
                    if ((n - i) % 2 != 0 && !kejitbe && arr[i] > 0) {
                        //second player
                        arr[i] = 0;
                        i++;
                        kejitbe = true;
                    }
                    if ((n - i) % 2 != 0 && kejitbe && arr[i] > 0) {
                        //First player
                        arr[i] = 0;
                        i++;
                        kejitbe = false;
                    }
                    if(arr[i-1] == 0 && i==n){
                        break;
                    }
                }
                if (!kejitbe) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
    }
