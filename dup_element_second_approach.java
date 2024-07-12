class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){           
                if(nums[i]==nums[i-1]){
                    return true;
                         
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0;i<n;i++){
            nums[i]= sc.nextInt();
        }
       System.out.println(s.containsDuplicate(nums));
    }
}