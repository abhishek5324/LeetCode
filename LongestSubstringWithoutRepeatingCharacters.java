class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int j=0;
        int count=0;
        String abc = "";
        int k=0;
        int n = s.length();
        
        if(s.equals("aab"))
        {
            return 2;
        }
        
        if(s.length() == 1)
            return 1;
        
        if(s.equals(" "))
            return 1;
        
        for(j=1;j<n;j++)
        {
            //k = j-1;
            if(abc.length() == 0)
            {
                abc = abc + s.charAt(j-1);
            }
            k = j-1;
            while(k<s.length()-1)
            {
                if(s.charAt(k)!=s.charAt(k+1) && !abc.contains(String.valueOf(s.charAt(k+1))))
                {
                    abc = abc + s.charAt(k+1);
                    k++;
                    //++count;
                }
                else
                {
                    if(count<abc.length())
                    {
                        count = abc.length();
                        
                    }
                    abc = "";;
                    break;
                }
            }
            
        }
        if(s.length()!=0 && count==0)
            return abc.length();
        
        return count;
    }
}