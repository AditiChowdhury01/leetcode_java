class Solution {
    public int fib(int n) {
        if (n==0||n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
        }
        public static void main(String [] args){
            Solution s = new Solution();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            s.fib(n);
        
    }
}