class Solution {
    public int commonFactors(int a, int b) {
        
        //int x = sc.nextInt();
        int count = 0;
        for(int x = 1;x<=a||x<=b;x++){
            
        if(a % x ==0 && b % x == 0){
            count = count+1;
        }
    }
    return count;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(s.commonFactors(a, b));
    }
    
}