package Leetcode;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {

        int left = 0, right = 0, max = -1, cur = k;

        while ((left <= right) && (right < nums.length)) {
            if (nums[right] == 1) {
                right++;
            } else {
                cur--;
                if (cur == -1) {
                    max = Math.max(right - left , max);

                    while (nums[left] != 0) {
                        left++;
                    }
                    left++;
                    cur = 0;
                }
                right++;
            }
        }
        return max;
    }

    public String reverseWords(String s) {
        String arr[] = s.split(" +");StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>=0;--i){
            if(arr[i].equals("")){
                continue;
            }
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
