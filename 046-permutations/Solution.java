class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList= new ArrayList<>();
        backtrack(finalList, new ArrayList<>(),nums);
        return finalList;
    }

    private void backtrack(List<List<Integer>> finalList, ArrayList<Integer>temp, int[]nums){
        if(temp.size()==nums.length){
            finalList.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            backtrack(finalList, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}