class Solution 
{
    int rStart;
    int rLength;
    public String longestPalindrome(String s)
    {
        int n = s.length();
        if(n<2)
            return s;
        for(int i=0;i<n-1;i++)
        {
            check(s,i,i);
            check(s,i,i+1);
            
        }
        
        return s.substring(rStart,rStart+rLength);
    }
    public void check(String s,int start,int end)
    {
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
        {
            start--;
            end++;
        }
        if(rLength < end-start-1)
        {
            rStart = start+1;
            rLength = end-start-1;
        }
    }
}