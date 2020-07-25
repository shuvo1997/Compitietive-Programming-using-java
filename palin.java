public class palin {
    static boolean isPalindrome(int num){
        String digits = String.valueOf(num);
        String ulta = "";
        for(int i=digits.length()-1; i>=0; i--){
            ulta += digits.charAt(i);
        }
        //System.out.println(ulta);
        if(digits.contains(ulta)) {
            return true;
        }
        else
            return false;
    }
    static int digits(int num){
        String s = "";
        while (num > 0){
            s += num%10;
            num /= 10;
        }
        return s.length();
    }
    public static void main(String[] args) {
        int n = 100000;
        int seven = n*7;
        for (int i = 100000; i < 999999; i++) {
            if (isPalindrome(i)){
                int s = i*7;
                if (isPalindrome(s) && digits(s) == 7){
                    System.out.println(i);
                    System.out.println(s);
                }
            }
        }

    }
}
