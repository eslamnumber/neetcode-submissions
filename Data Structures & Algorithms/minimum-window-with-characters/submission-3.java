class Solution {
        public String minWindow(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
     String res="";
     HashMap<Character,Integer> hs = new HashMap<>();
     HashMap<Character,Integer> ht = new HashMap<>();
        for(char ch : t.toCharArray())
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        for(int i =0;i<n;i++){
            ht.put(sb.charAt(i),ht.getOrDefault(sb.charAt(i),0)+1);
        }
        for(Character ch : t.toCharArray()) {
            if(ht.get(ch)==null)
                return res;
            if(ht.get(ch)<hs.get(ch))
                return res;
        }
        int start=0;
        int end=0;
        boolean f = false;
        boolean ff = false;
        int minLen = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            char ch = sb.charAt(i);
            if(hs.containsKey(ch)) {
                hs.put(ch, hs.get(ch) - 1);
                if(!f) {
                    start = i;
                    f = true;
                }

            }
            for(Character c : hs.keySet()){
                if(hs.get(c)>0){
                    ff=false;
                    break;
                }
                ff=true;
            }
            if(ff){
                end = i;
                if(minLen> end-start+1){
                    minLen = end-start+1;
                    res = sb.substring(start,end+1);
                }
                char chh = sb.charAt(start);
                for(int j = start+1;j<=end;j++){
                    if(hs.containsKey(sb.charAt(j))){
                        hs.put(sb.charAt(start),hs.get(sb.charAt(start))+1);
                        if(hs.get(sb.charAt(start))<=1){
                            if(minLen> end-start+1){
                                minLen = end-start+1;
                                res = sb.substring(start,end+1);
                            }
                        }
                        start =j;
                        if(s.charAt(j)!=chh){
                            break;
                        }

                    }
                }
                ff=false;
            }



        }
        return res;
    }

}
