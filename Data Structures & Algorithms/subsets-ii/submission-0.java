class Solution {
     public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> hx = new ArrayList<>();
        subsetsWithDuphelper(nums, hx , new ArrayList<>(), 0);
        return hx ;


    }


    public void subsetsWithDuphelper(int [] nums,List<List<Integer>> hx,ArrayList<Integer> curr, int idx){
        if(!hx.contains(curr))
          hx.add(new ArrayList<>(curr));
        if(idx== nums.length)
            return;

        curr.add(nums[idx]);
        subsetsWithDuphelper(nums,hx,curr,idx+1);
        curr.removeLast();
        subsetsWithDuphelper(nums,hx,curr,idx+1);




    }

}
