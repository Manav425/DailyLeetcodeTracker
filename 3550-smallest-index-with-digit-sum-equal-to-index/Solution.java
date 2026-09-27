class Solution {
    public int smallestIndex(int[] nums) {
        int i=0;
        int sum=0;
        while(i< nums.length){
            int num=nums[i];
            int s=0;
            while(num>0){
                int digit= num%10;
                s+=digit;
                num=num/10;
            }
            if(s==i){
                return i;
            }
            i++;
        }
        return -1;
    }
}