package Leetcode75;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){
        int t[] = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(t);
    }
    public static int removeDuplicates(int[] nums) {
        int c = 1, i = 0;
        int cur = nums[0];
        while (c < nums.length) {
            //find the next number
            while (c < nums.length && nums[c] == cur)
                c++;
            if ((c - i) < 2) {
                nums[i] = cur;
                i++;
                cur = nums[c];
            }
            if ((c - i) >= 2) {
                nums[i] = cur;
                nums[i + 1] = cur;
                i += 2;
                if (c < nums.length)
                    cur = nums[c];
            }
        }
        return i - 1;
    }
}
