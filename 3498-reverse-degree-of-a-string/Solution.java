class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=1; i<=s.length(); i++){
            int valBefore= s.charAt(i-1)- 'a';
            int fVal= 26- valBefore;
            res= res+ (i*fVal);
        }
        return res;
    }
}