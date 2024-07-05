class Solution {
    public int diagonalSum(int[][] mat) {
        
       int sum1 = 0;
       int sum2 = 0;
       for(int i =0;i<mat.length;i++){
        for(int j = 0;j<mat.length;j++){
            if(mat.length<=1){
            return mat[i][j];
        }
            if((i==j)){
                sum1 = sum1+mat[i][j];
            }
            else if(i+j==mat.length-1){
                sum2 =sum2+mat[i][j];
            }
            //sum3= sum1+sum2;
        }
       } 
       return sum1+sum2;
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
        System.out.println(s.diagonalSum(arr));
    }
}