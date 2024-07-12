class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(start<=end){
            while(start<end && vowels.indexOf(word[start])==-1){
                start++;
            }
            while(start<end && vowels.indexOf(word[end])==-1){
                end--;
            }
                char temp = word[start];
                word[start]= word[end];
                word[end] = temp;
                start++;
                end--;
        }
        String ans= new String(word);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Solution so = new Solution();
        String s = sc.next();
       System.out.println(so.reverseVowels(s));
    }
}