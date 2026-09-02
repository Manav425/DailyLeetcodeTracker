class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int o=x;
        int rev=0;
        while(o!=0){
            int d= o%10;
            rev= (rev*10)+d;
            o=o/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}