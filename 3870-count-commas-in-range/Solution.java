class Solution {
    public int countCommas(int n) {
        int comma=0;
        for(int i=0; i<=n; i++){
            if(i<=999){
                comma=0;
            }
            else if(i<=100000){
                comma++;
            }
        }
        return comma;
    }
}