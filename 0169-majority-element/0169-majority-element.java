// class Solution {
//     public int majorityElement(int[] nums) {
        
//         int n=nums.length;
//         HashMap<Integer, Integer> map=new HashMap<>();
//         for(int i=0; i<n; i++)
//         {
//             if(!map.containsKey(nums[i]))
//             {
//                 map.put(nums[i], 1);
//             }
//             else
//             {
//                 int count=map.get(nums[i]);
//                 map.put(nums[i], count + 1);
//             }
//         }

//         for(int key: map.keySet())
//         {
//             int count=map.get(key);
//             if(count>n/2){
//             return key;
//             }
//         }

//         return -1;
//     }
// }

//MOORE'S VOTING ALGORITHM

class Solution {
    public int majorityElement(int[] nums)
    {
        int n=nums.length;
        int can=nums[0];
        int count=1;
        for(int i=1; i<n; i++)
        {
            if(can==nums[i])
            count++;
            else
            count--;

            if(count==0)
            {
                can=nums[i];
                count=1;
            }
        }
        
        count=0;
        for(int i=0; i<n; i++)
        {
            if(can==nums[i])
            count++;
        }

        if(count>n/2)
        return can;
        else
        return -1;
    }
}