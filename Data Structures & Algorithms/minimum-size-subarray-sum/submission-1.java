class Solution {
        public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l =0;
        int sum =0;
        int mx =Integer.MAX_VALUE;
        if(target==0)
            return 0;
        for(int i =0;i<n;i++){
            sum+=nums[i];
            while (sum >= target) {
                    mx = Math.min(mx, i - l + 1);
                    sum -= nums[l];
                    l++;
                }


        }
        return mx==Integer.MAX_VALUE?0:mx;

    }

}