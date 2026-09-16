package leetcode;

import java.util.*;

public class disappear_number448 {
    static public List<Integer> findDisappearedNumbers(int[] nums){
        ArrayList<Integer> ans=new ArrayList<>();
        int[] a=new int[nums.length+1];
        int n=nums.length;
        for (int i=0;i<n;i++){
           a[nums[i]]=1;
        }
        for (int i=1;i<a.length;i++){
            if(a[i]!=1){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
    int[] a={4,3,2,7,8,2,3,1};
    List<Integer> ans=findDisappearedNumbers(a);
        System.out.println(ans);
    }
}
