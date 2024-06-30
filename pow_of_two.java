class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0;i<64;i++){
        double num = Math.pow(2,i);
        if(n==num){
            return true;
        }
        }
            return false;
    }
        public static void main(String[] args){
            Solution s = new Solution();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            System.out.println(s.isPowerOfTwo(n));
        
    }
}