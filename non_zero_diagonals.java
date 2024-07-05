class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                if (i==j || i+j ==grid.length-1){
                    if(grid[i][j]==0 ){
                    return false;
                    }
                }
                else if( grid[i][j]!=0){
                    return false;
                }
                
            }
            }
            return true;
    }
           
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++ ){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println(s.checkXMatrix(arr));
    }
}