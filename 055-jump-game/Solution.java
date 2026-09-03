class Solution {
    public boolean canJump(int[] nums) {
        int jump=0;
        int i=0;
        while(i<=jump && i<nums.length){
            jump=Math.max(jump, i+nums[i]);
            if(jump>= nums.length-1){
                return true;
            }
            i++;
        }
        return false;
    }
}