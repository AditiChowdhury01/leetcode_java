class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i= 0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Solution so = new Solution();
        String s = sc.next();
       System.out.println(so.finalString(s));
    }
}