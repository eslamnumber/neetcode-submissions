class Solution {
              public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
            int n = nums1.length;
            int  m = nums2.length;
            long  [] p = new long[n*m];
            for(int i =0;i<n;i++){
                for (int j =0;j<m;j++){
                    p[i*m+j] = (long) nums1[i] * nums2[j];
                }
            }
            Arrays.sort(p);
            return p[(int)k-1];
        }



}