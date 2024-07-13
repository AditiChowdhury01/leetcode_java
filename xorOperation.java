class Solution {
    public int xorOperation(int n, int start) {
       
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans =ans^start+(2*i);
        }
        return ans;
    }
    public static void mmain(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution so = new Solution();
        int n = sc.nextInt();
        int start = sc.nextInt();
        
        System.out.println(so.xorOperation(n,start));
    }

    
}