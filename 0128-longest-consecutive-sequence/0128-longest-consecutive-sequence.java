// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         if (n==0)
//         return 0;
//         int prevSmall=Integer.MIN_VALUE, count=1, maxCount=0;
//         for(int i=0; i<n; i++)
//         {
//             if(prevSmall==nums[i]-1)
//             {
//                 count++;
//             }
//             else if(nums[i]!=prevSmall)
//             {
//                 count=1;
//             }
//             prevSmall=nums[i];
//             maxCount=Math.max(count, maxCount);
            
//         }
//         return maxCount;
//     }
// }

//Optimal Solution:

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            set.add(nums[i]); //adding elements to set
        }

        int maxCount=0; 

        for(int i=0; i<n; i++)
        {
            if(!set.contains(nums[i]-1)) //if set doesn't contain starting of the subsequence
            {
                int count=1;
                int x=nums[i];
                while(set.contains(x+1)) //finding all subsequence
                {
                    count++;
                    x++;
                }
                maxCount=Math.max(maxCount,count);
            }
        }

        return maxCount;
    }
}