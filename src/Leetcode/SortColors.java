package Leetcode;

public class SortColors {
    public void sortColors(int[] nums) {
        int a = 0,b = 0,c = 0;
        for(int i =0; i< nums.length;i++){
            switch (nums[i]){
                case 0:
                    a++;
                    break;
                case 1:
                    b++;
                    break;
                case 2:
                    c++;
                    break;
            }
        }
        int i =0;
        for(; i< a;i++){
            nums[i] = 0;
        }
        for(int j = 0; j< b;j++){
            nums[i++] = 1;
        }
        for(int j = 0; j< c;j++){
            nums[i++] = 2;
        }
    }
}
