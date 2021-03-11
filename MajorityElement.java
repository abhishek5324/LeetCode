import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
           map.put(num,map.getOrDefault(num,0)+1);
        }
        int n = nums.length / 2;
        int ans = 0;
        for(int val : map.keySet())
        {
            int v = map.get(val);
            if(v > n)
            {
                ans = val;
                break;
            }
        }
        return ans;
        
    }
}