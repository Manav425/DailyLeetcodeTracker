class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int k: nums){
            if(map.get(k)==1){
                return k;
            }
        }
        return -1;
    }
}