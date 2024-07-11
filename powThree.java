class Solution {
    public boolean isPowerOfThree(int n) {
        if(n>=0){
     for(int i = 0;i<=32;i++){
        if(n==Math.pow(3,i)){
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
        System.out.println(s.isPowerOfThree(n));
    }
}