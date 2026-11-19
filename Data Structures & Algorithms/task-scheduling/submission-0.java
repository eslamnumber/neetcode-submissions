class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] chars= new int[27];
        PriorityQueue<int []> hx = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        for(char c :tasks){
            chars[c-'A']++;
        }
        for(int i =0;i<chars.length;i++){
            int c = chars[i];
            if(c==0)
                continue;
            int [] arr = {c,i,n};
            hx.add(arr);
        }
        ArrayDeque<int[]> hc = new ArrayDeque<>();
        int ans =0;
        while(!hx.isEmpty() || !hc.isEmpty())
        {
            ans++;
            if(!hx.isEmpty()) {
                int[] arr = hx.poll();
                arr[0]--;
                if (arr[0] > 0) {
                    arr[2] = n;
                    hc.addFirst(arr);
                }
            }
            if(!hc.isEmpty()) {
                int[] h = hc.removeLast();
                if (h[2] <= 0)
                    hx.add(h);
                else
                    hc.addLast(h);

                for (int i = 0; i < hc.size(); i++) {
                    int[] h1 = hc.removeFirst();
                    h1[2]--;
                    hc.addLast(h1);
                }
            }


        }
        return ans;
    }

}
