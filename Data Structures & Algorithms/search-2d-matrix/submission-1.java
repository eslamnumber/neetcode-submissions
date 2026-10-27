class Solution {
        public int search2(int[] nums, int target) {
     int  l =0;
     int r = nums.length-1;
     int mid = 0;
     while(l<=r){
          mid = l+(r-l)/2;
         if(nums[mid]>target)
             r = mid-1;
         else if(nums[mid]<target)
             l=mid+1;
         else
             return mid;
     }
     return -1;
    }


     public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m =matrix[0].length;
        int l =0;
        int r = n-1;
        int mid = 0;

        while(l<=r){
            mid = l +(r-l)/2;
           if(matrix[mid][0]<target)
               l=mid+1;
           else if(matrix[mid][0]>target)
               r=mid-1;
           else {
               return true;
           }
        }
        return search2(matrix[l>0?--l:++r], target) != -1;

    }


}
