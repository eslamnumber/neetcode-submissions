class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> hx = new ArrayDeque<>();
        int[] sol = new int[nums.length - k + 1];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (!hx.isEmpty() && hx.peekLast() < num) {
                hx.removeLast();
            }
            if(!hx.isEmpty() && i>=k && hx.peekFirst()==nums[i-k])
                hx.removeFirst();
            hx.addLast(num);

            if(i>=k-1 && !hx.isEmpty())
                sol[c++]=hx.peekFirst();

        }
      return sol;
}

}
