class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int  l =0;
         int r =0;
         int n =nums1.length+nums2.length;
         int xc =0;
         int current=0;

         while(l+r<=n/2)
         {
             xc = current;
             if( l<nums1.length && (r==nums2.length||nums1[l]<nums2[r]  )) {
                 current=nums1[l];
                 l++;
             }
             else if( r<nums2.length&& ( l==nums1.length || nums2[r]<=nums1[l])) {
                 current=nums2[r];
                 r++;
             }
         }
         return n%2==1?current: (double) (xc + current) /2;


    }


}
