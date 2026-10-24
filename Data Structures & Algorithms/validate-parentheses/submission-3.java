class Solution {
      public boolean isValid(String s) {
        char [] arr = s.toCharArray();
        ArrayDeque<Character> hs = new ArrayDeque<>();
        for (char c : arr) {
            if ((c == '(' || c == '[' || c == '{'))
                hs.push(c);
            else {
                char needed = c == ')' ? '(' : c == '}' ? '{' : '[';
                if(!hs.isEmpty() && hs.peek() == needed) {
                    hs.remove();
                }
                else
                    return false;

            }

        }
      return hs.isEmpty();

    }

}
