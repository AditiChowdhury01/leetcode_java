class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]= firstOcc(nums,target);
        if(arr[0]==-1){
            return new int[] {-1,-1};
        }
        arr[1] = lastOcc(nums,target);
        return arr;
    }
    public int firstOcc(int[] nums, int target) {
        
        int s = 0;
        int e = nums.length-1;
        int mid = s+(e-s)/2;
        int ans = -1;
        while(s<=e){
            if(target == nums[mid]){
                ans = mid;
                e = mid-1;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else if(target < nums[mid]){
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
public int lastOcc(int[] nums, int target) {
    int s = 0;
        int e = nums.length-1;
        int mid = s+(e-s)/2;
        int temp = -1;
        while(s<=e){
            if(target == nums[mid]){
                temp = mid;
                s = mid+1;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else if(target < nums[mid]){
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return temp;
    }
}