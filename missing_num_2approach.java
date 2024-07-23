class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int XOR1 = 0;
      for(int i = 0;i<=n;i++){
        XOR1 = XOR1^i;
      }
      for(int i = 0;i<n;i++){
        XOR1 = XOR1^nums[i];
      }
      return XOR1;
    }
}