import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        int count[] = new int[26];
        for(String str : strs)
        {
             Arrays.fill(count,0);
            for(int i=0;i<str.length();i++)
            {
               char c = str.charAt(i);
                int index = c - 'a';
                count[index]++;
                
            }
            
            StringBuilder sb = new StringBuilder();
            for(int counter : count)
            {
                sb.append("#");
                sb.append(counter);
            }
            String key = sb.toString();
            
            List<String> li = map.getOrDefault(key, new ArrayList<>());
            li.add(str);
            map.put(key,li);
            
        }
        return new ArrayList(map.values());
       
           
        
    }
}