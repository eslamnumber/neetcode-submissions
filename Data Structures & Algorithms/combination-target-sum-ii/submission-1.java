class Solution {
     public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        combinationSumHelper(nums, target, res, new ArrayList<>(), 0, 0);
        return res;

    }

    public void combinationSumHelper(int[] nums, int target, List<List<Integer>> result,List<Integer> curr, int sum,int i  ) {
        if(sum==target)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        if(sum > target || i>=nums.length)
            return;
        curr.add(nums[i]);
        combinationSumHelper(nums,target,result, curr, sum+nums[i],i+1);
        int idx = i ;
        while(idx< nums.length-1 && nums[idx]==nums[idx+1])
        {
            idx++;
        }
        curr.removeLast();
        combinationSumHelper(nums,target,result, curr, sum,idx+1);


    }


}
