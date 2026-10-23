class Solution {
        public int[] productExceptSelf(int[] nums) {
        long prod = 1;
        int [] sol = new int[nums.length];
        int zeros=0;
        for(int num:nums){
            if(num==0) {
                zeros++;
                continue;
            }
            prod*=num;
        }
        if(zeros>1)
            return new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                sol[i]= (int) prod;
                return sol;
            }
            if(zeros==0)
              sol[i]= (int) (prod/nums[i]);
        }
        return sol;
    }

}  
