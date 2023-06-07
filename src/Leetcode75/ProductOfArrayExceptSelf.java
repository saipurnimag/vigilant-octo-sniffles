package Leetcode75;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int ltor[] = new int[nums.length];
        int rtol[] = new int[nums.length];
        ltor[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            ltor[i] = ltor[i - 1] * nums[i];
        }
        rtol[nums.length - 1] = nums[nums.length - 1];
        for (int i = (nums.length - 1); i >= 0; --i) {
            rtol[i] = rtol[i - 1] * nums[i];
        }
        int output[] = new int[nums.length];
        output[0] = rtol[1];
        output[nums.length - 1] = ltor[nums.length - 1];
        for (int i = 1; i < nums.length - 1; ++i) {
            output[i] = ltor[i-1]*rtol[i+1];
        }
        return output;
    }
}
