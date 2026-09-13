class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!= nums[1]) return nums[0];
        if(nums[nums.length-1]!= nums[nums.length-2]) return nums[nums.length-1];
        int l=0, h=nums.length-2;
        while(l<=h){
            int mid= l+(h-l)/2;
            if(nums[mid]!= nums[mid-1]&& nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1]){
                if(mid%2!=0){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            else{
                if(mid%2==0){
                    l=mid+1;
                }   
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}