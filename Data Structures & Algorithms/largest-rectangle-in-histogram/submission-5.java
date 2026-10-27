class Solution {
  public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> hx = new ArrayDeque<>();
        int mxArea =0;

        for(int i =0;i<heights.length;i++){
            int height = heights[i];
            while(!hx.isEmpty() && heights[hx.peekLast()]>height )
            {
                int h = heights[hx.removeLast()];
                int w = hx.isEmpty() ? i : i - hx.peekLast() - 1;
                mxArea = Math.max(mxArea, w * h);
            }
            hx.add(i);
        }
        int n = heights.length;
        while(!hx.isEmpty()){
            int h = heights[hx.removeLast()];
            int w =!hx.isEmpty()? n-hx.peekLast()-1:n;
            mxArea=Math.max(mxArea,w*h);

        }

        return mxArea;

    }
}
