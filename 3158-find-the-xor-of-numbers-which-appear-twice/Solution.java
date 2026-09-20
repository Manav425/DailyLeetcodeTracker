class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        int res=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int k: map.keySet()){
            if(map.get(k)==2){
                arr.add(k);
            }
        }
        for(int i=0; i<arr.size(); i++){
            res^= arr.get(i);
        }
        return res;
    }
}