// class Solution {
//     public int maxArea(int[] height) {
//         //bruteforce gives TLE cause complexity is O(n^2)
//         int n=height.length;
//         int area=0;
//         int ans=0;
//         // for(int i=0;i<n;i++)
//         // {
//         //     for(int j=i+1;j<n;j++)
//         //     {
//         //         area=(j-i)*Math.min(height[i],height[j]);
//         //         ans=Math.max(ans, area);
//         //     }
//         // }

//         //Optimal TWO POINTER
//         int L=0;
//         int R=n-1;
//         while(L<R)
//         {
//              area=(R-L)*Math.min(height[L],height[R]);
//              ans=Math.max(ans, area);

//              if(height[L]<height[R])
//              L++;
//              else if(height[L]==height[R])
//              {L++;R--;}
//              else
//              R--;
//         }
//         return ans;
//     }
// }

import java.lang.Math;
class Solution {
    public int maxArea(int[] height) {
        int left,right;
        left=0;
        right=height.length-1;
        int A[]=new int[height.length];
        for(int i=0;i<(height.length);i++)
        {
            if(height[left]>height[right])
            {
                A[i]=height[right]*(Math.abs(left-right));
                right--;
            }
            else
            {
                A[i]=height[left]*(Math.abs(left-right));
                left++;
            }
        }
        
       // Initialize maximum element
         int max = A[0];
       
         // Traverse array elements from second and
         // compare every element with current max 
         for (int i = 1; i < A.length; i++)
         {
             if (A[i] > max)
                 max =A[i];
         }
        
    return max;
    }
}