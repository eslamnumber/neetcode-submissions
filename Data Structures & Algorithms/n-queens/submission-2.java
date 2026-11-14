class Solution {
     public List<List<String>> solveNQueens(int n) {
        List<List<String>> hx = new ArrayList<>();
        boolean [][] visited =new boolean[n][n];
        solveNQueensHelper(n,visited,0,hx,0);

       return hx;

    }
 public void solveNQueensHelper(int n, boolean[][] visited, int q,
                               List<List<String>> res, int i) {
    if (i == n) return;

    List<String> curr = new ArrayList<>();
    if (!valid(visited, n, curr)) return;

    if (q == n) {
        res.add(curr);
        return;
    }

    visited[q][i] = true;
    solveNQueensHelper(n, visited, q + 1, res, 0);
    visited[q][i] = false;
    solveNQueensHelper(n, visited, q, res, i + 1);
}


    public boolean valid(boolean [][] hx,int n,List<String> res){
        int qr =0;
        int qc =0;

        for(int i =0;i<n;i++)
        {
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++)
            {
                if(hx[i][j]) {
                    qr++;
                    str.append("Q");
                    for (int k = 1; i + k < n; k++) {
                        if (j + k < n && hx[i + k][j + k]) return false;
                        if (j - k >= 0 && hx[i + k][j - k]) return false;
                    }
                }
                else
                    str.append(".");
                if(hx[j][i])
                    qc++;
                if(qr>1|| qc>1 )
                    return false;


            }
            res.add(str.toString());
            qr=0;
            qc=0;

        }

        return true;

    }


}
