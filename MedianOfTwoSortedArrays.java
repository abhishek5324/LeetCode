import java.util.*;
//import java.Math.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double y = 0;
        int n = nums1.length;
        int m = nums2.length;
        int med = (n+m)-1;
        int[] a = new int[n+m];
        if(nums1.length!=0)
        {
            for(int i=0;i<n;i++)
            {
                a[i] = nums1[i];
            }
        }
        int j=n;
        if(nums2.length!=0)
        {
            for(int i=0;i<m;i++)
            {
                a[j] = nums2[i];
                j++;
            }
        }
        
        Arrays.sort(a);
        
        if(med%2 == 0)
        {
            int z = (med/2);
            int x = a[z];
             y = (double)x;
            //return y;
        }
        else
        {
           int z = (med/2);
            int x = z+1;
            int c = a[z]+a[x];
            
             y = (double)c/2;
        }
        return y;
    }
}