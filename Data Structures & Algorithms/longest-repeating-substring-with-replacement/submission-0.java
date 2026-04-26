class Solution {
    public int characterReplacement(String s, int k) {
        int ans =0;
        for(int i =0;i<s.length();i++){
        HashMap<Character,Integer> sol = new HashMap<>();
        int m =0;
        for(int j =i;j<s.length();j++) {
            if (sol.containsKey(s.charAt(j))) {
                sol.put(s.charAt(j), sol.get(s.charAt(j)) + 1);
            } else {
                sol.put(s.charAt(j), 1);
            }
              m= Math.max(m, sol.get(s.charAt(j)));

            if (j - i + 1 - m <=k) {
                ans = Math.max(ans, j - i + 1);
            }

        }
        }
        return ans;

    }
}
