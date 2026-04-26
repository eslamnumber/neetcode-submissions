class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) nums[i] = n + 1;
        }

        for (int i = 0; i < n; i++) {
            int pos = Math.abs(nums[i]);
            if (pos >= 1 && pos <= n) {
                pos -= 1;
                nums[pos] = -Math.abs(nums[pos]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) return i + 1;
        }

        return n + 1;
    }
}