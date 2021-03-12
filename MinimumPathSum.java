class Solution {
    public int minPathSum(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n+1][m+1];
        for(int row[] : dp)
        {
            Arrays.fill(row,-1);
        }
        return minPathSum(grid,grid.length-1,grid[0].length-1,0,0,dp);  
    }
    public int minPathSum(int grid[][],int cr,int cc,int er,int ec ,int dp[][])
    {
        if(cr == er && cc == ec)
        {
            return grid[cr][cc];
        }
        
        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }
        if(cr == 0)
        {
            return dp[cr][cc] = minPathSum(grid,cr,cc-1,er,ec,dp) + grid[cr][cc];
        }
        if(cc == 0)
        {
            return dp[cr][cc] =  minPathSum(grid,cr-1,cc,er,ec,dp) + grid[cr][cc];
        }
        //up move
        int up = minPathSum(grid,cr-1,cc,er,ec,dp);
        //left move
        int left = minPathSum(grid,cr,cc-1,er,ec,dp);
        
        int myAns = Math.min(up,left) + grid[cr][cc];
        
        return dp[cr][cc]=myAns;
    }   
}