class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Solution so = new Solution();
        //int n = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        
       so.reverseString(chars);
    }
    
}