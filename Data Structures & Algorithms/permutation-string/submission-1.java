class Solution {
       public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        int k = s1.length();
        int n = s2.length();
        int l =0;
        for(int i =0;i<n;i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
            if(i-l==k-1){
                boolean f = true;
                for(char c : map.keySet()){
                    if(map.get(c)!=0){
                        f=false;
                        break;
                    }
                }
                if(f)
                    return true;
                char leftChar = s2.charAt(l);
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                }
                l++;
            }
        }
        return  false;
    }

}
