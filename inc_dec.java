class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isInc = true;
        boolean isDec= true;
        int n = nums.length;
        if(n ==1){
            return true;
        }

        for(int i = 1;i<nums.length;i++){
            
            if(nums[i]<nums[i-1]){
                isInc =  false;

            }
            if(nums[i]>nums[i-1]){
                isDec = false;
            }
            if(!isInc && !isDec){
                return false;
            }
        }
        return isInc||isDec;
    }
}