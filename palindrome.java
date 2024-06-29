
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int rev = 0;
        while(temp>0){
            rem = temp%10;
            rev = (rev*10)+rem;
            temp = temp/10;
        }
        if (x==rev){
            return true;
        }
        else{
            return false;
        }
    }
        public static void main(String args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            Solution s = new Solution();
            System.out.println(s.isPalindrome(x));
        
    }
}