class Solution {
    public boolean isMonotonic(int[] nums) {
        if(isMonoDec(nums) || isMonoInc(nums)== true){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isMonoDec(int[]nums){
        for(int i=0,j=1; i<nums.length&& j<nums.length; i++,j++){
            if(i<=j &&nums[i]>=nums[j]){
                continue;
            }
            return false;
        }
        return true;
    }
    boolean isMonoInc(int[]nums){
        for(int i=0,j=1; i<nums.length&&j<nums.length; i++,j++){
            if(i<=j &&nums[i]<=nums[j]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}