class Solution {
  public int subarraySum(int[] nums, int k) {
        Map<Long, Integer> countBySum = new HashMap<>();
        countBySum.put(0L, 1); 

        long prefix = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            count += countBySum.getOrDefault(prefix - k, 0);

            countBySum.put(prefix, countBySum.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}