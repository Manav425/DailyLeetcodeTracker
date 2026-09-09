class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans= new ArrayList<>();
        int s=1;
        while(s<=9){
            int n=s;
            int nD=s+1;
            while(n<=high &&nD<=9){
                n= n*10+nD;
                if(n>=low && n<=high){
                ans.add(n);
                }
                nD++;
            }
            s++;
        }
        ans.sort(null);
        return ans;
    }
}
