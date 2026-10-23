class Solution {
        public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt =0;
        int x =0;
        if(nums.length==1)
            return 1;
         if(nums.length==0)
            return 0;
        for(int i =1;i<=nums.length;i++){
            boolean flag = i < nums.length;
            if(flag && nums[i] - nums[i - 1] == 0 ){
                continue;
            }
            if(flag && nums[i]-nums[i-1]==1 )
                x++;
            else
            {
                if(i-2>=0) {
                    int y = nums[i - 1] - nums[i - 2];
                    if (y == 0 || y == 1)
                        x++;
                }
                cnt=Math.max(x,cnt);
                x=0;
            }
        }
           if(cnt==0)
            return 1;
        return Math.max(cnt,x);
    }

}
