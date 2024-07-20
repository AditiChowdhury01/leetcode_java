class Solution {
    public boolean isPalindrome(String s) {
        int st= 0;
        int e = s.length()-1;
        
        while(st<=e){
            char first = s.charAt(st);
            char last = s.charAt(e);
            if(!Character.isLetterOrDigit(first)){
                st++;
            }
            else if(!Character.isLetterOrDigit(last)){
                e--;
            }
            else if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                return false;
            }
            else{
                st++;
                e--;
            }
        }
        return true;

    }
}