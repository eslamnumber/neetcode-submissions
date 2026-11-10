class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> hx = new ArrayList<>();
        permuteHelper(nums, hx , new ArrayList<>());
        return hx;

    }


    public void permuteHelper(int [] nums,List<List<Integer>> hx,ArrayList<Integer> curr){
        if(curr.size()==nums.length)
        {
            hx.add(new ArrayList<>(curr));
            return;
        }
        for (int num : nums) {
            if (curr.contains(num))
                continue;
            curr.add(num);
            permuteHelper(nums, hx, curr);
            curr.removeLast();

        }


    }

}
