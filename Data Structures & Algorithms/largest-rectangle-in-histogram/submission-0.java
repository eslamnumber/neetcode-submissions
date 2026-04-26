class Solution {
    
    public int largestRectangleArea(int[] heights) {
        int [] left = new int[heights.length];
        int [] right = new int[heights.length];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        for(int i =0;i<n;i++){
            while (!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            left[i] = st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i =n-1;i>=0;i--){
            while (!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            right[i] = st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
        int mx = 0;
        int mn = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            mx = Math.max(mx,heights[i]*((left[i]+right[i])-1));
        }
        return mx;
    }

}
