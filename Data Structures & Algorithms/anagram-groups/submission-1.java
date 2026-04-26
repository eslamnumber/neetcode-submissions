
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char []  strsChar;
        String[] strsTemp = new String[strs.length];
        for(int i =0;i<strs.length;i++){
            strsChar = strs[i].toCharArray();
            java.util.Arrays.sort(strsChar);
            strsTemp[i] = new String(strsChar);
        }
        Hashtable<String,List<String>> sol = new Hashtable<>();
        for(int i =0;i<strs.length;i++){
            if(sol.containsKey(strsTemp[i])){
                sol.get(strsTemp[i]).add(strs[i]);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                sol.put(strsTemp[i],temp);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key:sol.keySet()){
            res.add(sol.get(key));
        }
        return res;
}
}
