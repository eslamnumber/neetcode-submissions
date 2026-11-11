class Solution {
     public List<String> generateParenthesis(int n) {
        ArrayList<String> hx = new ArrayList<>();
        generateParenthesisHelper(n-1, n, hx, new StringBuilder("("));
        return hx;


    }

    public void generateParenthesisHelper(int n ,int m, ArrayList<String> hx,StringBuilder curr){
        if(n==0 && m==0)
        {
            hx.add(curr.toString());
            return;
        }
        if(n>0)
        {
            curr.append("(");
            generateParenthesisHelper(n-1,m,hx, curr);
            curr.deleteCharAt(curr.length()-1);
        }
        if(m>n)
        {
            curr.append(")");
            generateParenthesisHelper(n,m-1,hx, curr);
            curr.deleteCharAt(curr.length()-1);

        }


    }

}
