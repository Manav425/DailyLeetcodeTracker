class Solution {
    public int minimumDeletions(int[] nums) {
        int  minNum=nums[0];
        int maxNum=nums[0];
        int minIndex=0;
        int maxIndex=0;
        int res=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<minNum){
                minNum= nums[i];
                minIndex=i;
            }
            else if(nums[i]>maxNum){
                maxNum= nums[i];
                maxIndex=i;
            }
        }
        int n= nums.length;
        int l= Math.max(minIndex, maxIndex)+1;
        int r= n-Math.min(minIndex, maxIndex);
        int both= Math.min(minIndex, maxIndex)+1 + n- Math.max(minIndex,maxIndex);
        return Math.min(l, Math.min(r,both));

    }
}