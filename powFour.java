class Solution {
    public boolean isPowerOfFour(int n) {
        if(n>=0){
            for(int i = 0;i<32;i++){
                if(n == Math.pow(4,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        System.out.println(s.isPowerOfFour(n));
    }
}