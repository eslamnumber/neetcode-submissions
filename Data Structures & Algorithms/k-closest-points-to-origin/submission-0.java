class Solution {
   public int[][] kClosest(int[][] points, int k) {
        int [][] res = new int[k][points[0].length];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Long.compareUnsigned(distanceSquared(a), distanceSquared(b))
        );
                pq.addAll(Arrays.asList(points));

        for(int i =0;i<k;i++)
            res[i]= pq.poll();
        return res;
        
    }


    private long distanceSquared(int[] point) {
        long x = point[0];
        long y = point[1];
        return x * x + y * y;
    }


}
