class Solution {
      public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            if(hs.containsKey(target-num)&& i!=hs.get(target-num))
                return new int[]{i,hs.get(target-num)};
        }
        return new int []{};

    }

}
