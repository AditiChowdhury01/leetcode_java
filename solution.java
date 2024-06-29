import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            
            else if(target<nums[mid]) {
               high = mid-1; 
            }
            else{
                return -1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Solution s = new Solution();
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            //arr.sort();
            int target = sc.nextInt();
            
            System.out.println(s.search(arr,target)); 
        
    }
}