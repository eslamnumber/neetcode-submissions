class Solution {
       public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n =arr.length;
        int cn =0;
        int sum =0;
        int l =-1;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum/k<threshold&&i-l==k) {
                l++;
                sum -= arr[l];
            }
            if(i-l ==k){
                if(sum/k>=threshold)
                    cn++;

                sum-=arr[++l];
            }
        }
        return cn;

    }

}