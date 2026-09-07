class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<=2){
                nums[cnt]=nums[i];
                cnt++;
            }
            else{
                continue;
            }
        }
        return cnt;
    }
}