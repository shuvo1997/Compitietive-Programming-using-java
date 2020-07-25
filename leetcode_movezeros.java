public class leetcode_movezeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0,12,0};
        int[] newarr = new int[nums.length];
        int i=0;
        int j=0;
        int len = nums.length;
        while(j<nums.length){
            if(nums[j] != 0){
                newarr[i] = nums[j];
                i++;
            }
            else {
                newarr[len-1] = 0;
                len--;
            }
            j++;
        }
        for (int num: newarr) {
            System.out.println(num);
        }
    }
}
