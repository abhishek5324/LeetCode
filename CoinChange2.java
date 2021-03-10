class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        
        for(int row=0;row<=n;row++)
        {
            dp[row][0] = 1;
        }
        for(int col=1;col<=amount;col++)
        {
            dp[0][col] = 0;
        }
        
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=amount;col++)
            {
                int inc = 0, exc = 0;
                if(col >= coins[row-1])
                {
                    inc = dp[row][col - coins[row-1] ];
                }
                exc = dp[row-1][col];
                int ans = inc + exc;
                dp[row][col]=ans;
            }
        }
        return dp[n][amount];
        
        /* for(int row[] : dp)
        {
            Arrays.fill(row,-1);
        }
        return change(amount,coins,dp,n);
        
    }
    public int change(int amount,int []coins,int dp[][],int n)
    {
        int inc = 0,exc = 0;
        if(amount == 0)
            return 1;
        if(n == 0)
            return 0;
        if(dp[n][amount] != -1)
        {
            return dp[n][amount];
        }
        if(amount >= coins[n-1])
        {
            inc = change(amount - coins[n-1],coins,dp,n);
        }
        exc = change(amount,coins,dp,n-1);
        int ans = inc+exc;
        dp[n][amount] = ans;
        return ans;*/
        
        
    }
}