class Solution {
     String[] digitToChar = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty())
          return res;
        letterCombinationsHelper(digits,res,0,"");
        return res;
    }


    public void letterCombinationsHelper(String digits,List<String> res, int i,String curr) {
        if(curr.length()==digits.length()){
            res.add(curr);
            return ;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];
        for(char c :chars.toCharArray()){
            letterCombinationsHelper(digits,res,i+1,curr+c);
        }

    }

}
