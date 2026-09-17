class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr= s.toCharArray();
        int l=0;
        int r= s.length()-1;
        while(l<r){
            if(arr[l]>arr[r]){
                arr[l]=arr[r];
            }
            else{
                arr[r]=arr[l];
            }
            l++;
            r--;
        }
        return new String(arr);
    }
}