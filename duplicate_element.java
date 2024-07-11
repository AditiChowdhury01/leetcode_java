class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
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