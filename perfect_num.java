class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1;i<=num/2;i++){
            if(num%i==0){
                sum = sum +i;
            }
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int num = sc.nextInt();
        System.out.println(s.checkPerfectNumber(num));
    }
}