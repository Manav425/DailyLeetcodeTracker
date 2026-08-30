class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int[]ans= new int[k];
        int index=0;
        while(index<k){
            int max=0, maxKey=0;
            for(int key: map.keySet()){
                if(map.get(key)>max){
                    max=map.get(key);
                    maxKey=key;

                }
            }
            ans[index]=maxKey;
            index++;
            map.remove(maxKey);
        }
        return ans;
    }
}