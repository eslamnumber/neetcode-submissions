class Solution {
      public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l =0;
        int r =0;
        HashSet<Character> hx = new HashSet<>();

        int sol =0;
        while(r<sb.length()){
          if(hx.contains(sb.charAt(r))||r==sb.length()-1)
          {

              sol=Math.max(sol,r==sb.length()-1&&!hx.contains(sb.charAt(r))?r-l+1:r-l);
              while(hx.contains(sb.charAt(r)))
              {
                  hx.remove(sb.charAt(l));
                  l++;

              }
          }
          hx.add(sb.charAt(r));
          r++;
        }
        return sol;

    }

}
