class Solution {
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> hx  = new ArrayList<>();
         subsets2(nums,hx, 0, new ArrayList<>());
         return hx;

    }
    public void subsets2(int[] nums,List<List<Integer>> hx, int i, List<Integer> curr  ){
        if(i ==nums.length){
            hx.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[i]);
        subsets2(nums,hx,i+1,curr);
        curr.removeLast();
        subsets2(nums,hx,i+1,curr);



    }
}
