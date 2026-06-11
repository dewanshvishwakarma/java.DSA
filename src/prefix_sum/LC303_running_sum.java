package prefix_sum;

public class LC303_running_sum {
    public int[] runningSum(int[] nums) {
        int n=nums.length;

        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }

        return nums;
    }
}
