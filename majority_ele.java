class Solution {
    public int majorityElement(int[] nums) {
    int n = nums.length;
    int ele = 0;;
     int count = 0;
     for(int i = 0;i<nums.length;i++){
        if(count == 0){
            count=1;
            ele = nums[i];            
        }
        else if(nums[i]==ele){
            count++;
        }
        else{
            count--;
        }
     }
     int count1 = 0;
     for(int i = 0;i<nums.length;i++){
        if(ele == nums[i]){
            count1++;
        }
     }
        if(count1>n/2){
            return ele;
        }
     
     return -1;
    }
}