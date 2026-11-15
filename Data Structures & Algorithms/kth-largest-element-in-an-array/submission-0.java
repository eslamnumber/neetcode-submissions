class Solution {
      public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> hx = new PriorityQueue<>(Collections.reverseOrder());
        for(int n :nums)
            hx.add(n);
        while(--k>0)
            hx.poll();
        return !hx.isEmpty()?hx.poll():0;

    }


}
