class Solution {
       public int evalRPN(String[] tokens) {
        ArrayDeque<String> hx = new ArrayDeque<>();
        for(String ch : tokens){
            String res;
            if(ch.equals("+") ||ch.equals("-")||ch.equals("*")||ch.equals("/")) {
                res = ops(hx.removeLast(), hx.removeLast(), ch);
                hx.addLast(res);
                continue;
            }
            hx.addLast(ch);

        }

        return Integer.parseInt(hx.removeLast());

    }

    public String ops(String s1 ,String s2 , String op){
        int n1 =Integer.parseInt(s1);
        int n2 =Integer.parseInt(s2);
        switch (op) {
            case "+" -> {
                return "" + (n1 + n2);
            }
            case "*" -> {
                return "" + (n1 * n2);
            }
            case "-" -> {
                return "" + (n2 - n1);
            }
            case "/" -> {
                return "" + (n2 / n1);
            }
        }
        return "";

    }

}
