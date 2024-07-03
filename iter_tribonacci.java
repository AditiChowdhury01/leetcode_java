class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b =1;
        int c = 1;
        int ans;
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        
        for(int i=3;i<=n;i++){
            ans = a+b+c;
            a=b;
            b=c;
            c=ans;
        }
        return c;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.tribonacci(n));
    }
}