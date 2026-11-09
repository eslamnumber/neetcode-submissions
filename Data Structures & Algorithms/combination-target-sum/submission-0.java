class Solution {
   public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinationSumHelper(nums, target, res, new ArrayList<>(), 0, 0);
        return res;

    }

    public void combinationSumHelper(int[] nums, int target, List<List<Integer>> result,List<Integer> curr, int sum,int i  ) {
        if(sum==target)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        if(sum > target ||i==nums.length)
            return;
        curr.add(nums[i]);
        combinationSumHelper(nums,target,result, curr, sum+nums[i],i);
        curr.removeLast();
        combinationSumHelper(nums,target,result, curr, sum,i+1);


    }
}
