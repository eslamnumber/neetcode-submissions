class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        int[] res = new int[n];
        boolean flag = false;
        for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && heights[st.peek()] < heights[i]) {
                    st.pop();
                    res[i]++;

                }
                if(!st.isEmpty())
                    res[i]++;
            st.push(i);

        }
        return res; 
    }   
}