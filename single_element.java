class Solution {
    public int singleNumber(int[] nums) {
        int max = 0;
        
        for(int i = 0;i<nums.length;i++){         
               max = max^nums[i]  ;  
        }
        return max;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(s.singleNumber(nums));
    }
}