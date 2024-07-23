class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] ans = new int[nums.length];
       int negIndex = 1;int posIndex = 0;
       for(int i = 0;i < nums.length;i++){
          if(nums[i]>0){
            ans[posIndex] = nums[i];
            posIndex+=2;
          }
          if(nums[i]<0){
            ans[negIndex]=nums[i];
            negIndex+=2;
          }
       } 
       return ans;
    }
}