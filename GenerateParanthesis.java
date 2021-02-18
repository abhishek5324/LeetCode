class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> output = new ArrayList<>();
        generateParenthesis(n,"",0,0,output);
        return output;
    }
     public void generateParenthesis(int n,String ans, int op,int               cp,ArrayList<String> output) {
         
         
         if(op==n && cp==n)
         {
             output.add(ans);
             return;
         }
         if(op < n)
         {
             generateParenthesis(n,ans+"(",op+1,cp,output);
         }
         if(op > cp)
         {
             generateParenthesis(n,ans+")",op,cp+1,output);
         }
         return;
     }
}