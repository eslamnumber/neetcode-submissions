

class Solution {
   

 public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        int missing = t.length();
        int left = 0;

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (need.containsKey(c)) {
                if (need.get(c) > 0)
                    missing--;

                need.put(c, need.get(c) - 1);
            }

            while (missing == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);

                if (need.containsKey(lc)) {
                    need.put(lc, need.get(lc) + 1);

                    if (need.get(lc) > 0)
                        missing++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
