class Solution {
       public int maxArea(int[] heights) {
        // to get the largest area we need max width and max height
        // the height is calculated based on the small height of the two col of the containter
        // two pointer to shrink the width from the side of the smallest height
        int l =0;
        int r = heights.length-1;
        int mx =0;
        while(l<=r){
            int wd = r-l;
            int h = Math.min(heights[l],heights[r]);
            int area = wd*h;
            mx =Math.max(mx,area);
            if(heights[l]<heights[r])
                l++;
            else
                r--;

        }
        return mx;

    }

}
