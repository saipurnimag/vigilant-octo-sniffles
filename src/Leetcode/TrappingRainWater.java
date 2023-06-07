package Leetcode;

public class TrappingRainWater {
    public int trap(int[] height) {
        if(height.length<2){
            return 0;
        }
        int[] ltor = new int[height.length];
        int[] rtol = new int[height.length];
        ltor[0] = 0;
        ltor[1] = height[0];
        for (int i = 2; i < height.length; ++i) {
            ltor[i] = Math.max(ltor[i - 1], height[i - 1]);
        }
        rtol[height.length - 1] = 0;
        rtol[height.length - 2] = height[height.length - 1];
        for (int i = height.length - 3; i >= 0; --i) {
            rtol[i] = Math.max(rtol[i + 1], height[i + 1]);
        }
        int ans = 0;
        for (int i = 0; i < height.length; ++i) {
            int min = Math.min(ltor[i], rtol[i]);
            if (min > height[i]) {
                ans = ans + min - height[i];
            }
        }
        return ans;
    }
}
