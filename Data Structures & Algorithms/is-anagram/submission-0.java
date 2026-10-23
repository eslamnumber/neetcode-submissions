class Solution {
      public boolean isAnagram(String s, String t) {
        char[] xs = s.toCharArray();
        char[] xy = t.toCharArray();
        if(xs.length!=xy.length)
            return false;
        int [] arr = new int [28];
        for(int i =0;i<xs.length;i++){
            arr[xs[i]-'a']++;
            arr[xy[i]-'a']--;
        }
        for (int j : arr) {
            if (j != 0)
                return false;
        }
        return true;
    }

}
