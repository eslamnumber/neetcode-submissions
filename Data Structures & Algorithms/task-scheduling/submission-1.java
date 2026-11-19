class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] chars= new int[27];
        PriorityQueue<int []> hx = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        int f = Integer.MIN_VALUE;
        for(char c :tasks){
            chars[c-'A']++;
             f= Math.max(f,chars[c-'A']);
        }
        int gab =0;
        for(int count:chars)
            if(count==f)
                gab++;

        return Math.max(tasks.length,(f-1)*(n+1)+gab);

    }

}
