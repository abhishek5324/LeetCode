import java.util.ArrayList;
class Solution {
    public List<String> letterCombinations(String digits) {
       
        List<String> li = new ArrayList<>();
        if(digits.length()==0)
        {
            return li;
        }
        List<String> a = printCode(digits,"",li);
        return a;
        
    }
     private static String getCode(char c)
    {
        if(c=='2'){
            return "abc";
        }
        else if (c=='3'){
            return "def";
        }
        else if(c=='4'){
            return "ghi";
        }
        else if(c == '5'){
            return "jkl";
        }
        else if(c == '6'){
            return "mno";
        }
        else if(c == '7'){
            return "pqrs";
        }
        else if(c == '8'){
            return "tuv";
        }
        else if(c == '9'){
            return "wxyz";
        }
        else
            return "";
    }
    private List<String> printCode(String digits,String ans,List<String> li)
    {
        if(digits.length()==0)
        {
            li.add(ans);
            return li;
        }
        
        char Zeroth = digits.charAt(0);
        String leftDigits = digits.substring(1);
        String ZeroCharString = getCode(Zeroth);
        
        for(int i=0;i<ZeroCharString.length();i++)
        {
            printCode(leftDigits,ans+ZeroCharString.charAt(i),li);
        }
        return li;
    }
}