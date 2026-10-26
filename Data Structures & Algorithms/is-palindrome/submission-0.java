class Solution {
   public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }


}
