class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int x= Math.max(1,n-k);
        int sum=0;
        while(x<=n+k){
            if(Math.abs(n-x)<=k && (n&x)==0){
                sum+=x;
            }
            x++;
        }
        return sum;
    }
}