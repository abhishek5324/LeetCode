class Solution {
    public int climbStairs(int n) {
       /*if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        int c1 = climbStairs(n-1);
        int c2 = climbStairs(n-2);
        
        int ans = c1+c2;
        return ans;*/
        
        int storage[] = new int[n+1];
        storage[0] = 1;
        storage[1] = 1;
        
        for(int i=2;i<=n;i++)
        {
            int c1 = storage[i-1];
            int c2 = storage[i-2];
            
            int ans = c1+c2;
            storage[i] = ans;
            
        }
        return storage[n];

    }
}