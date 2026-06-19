package prefix_sum;
//https://leetcode.com/problems/product-of-array-except-self/description/
public class LC238_Product_of_array_except_self {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];}
        int rightp=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightp;
            rightp=rightp*nums[i];}
        return ans;
    }

    public static void main(String[] args) {
    }

}
