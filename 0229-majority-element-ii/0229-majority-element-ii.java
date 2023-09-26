// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
        
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

//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int key: map.keySet())
//         {
//             int count=map.get(key);
//             if(count>n/3)
//             arr.add(key);
//         }

//         return arr;
//     }
// }

//MOORE'S AGAIN

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            List<Integer> result = new ArrayList<>();
            if (n == 1) {
                result.add(nums[0]);
            }
            return result;
        }

        int can1 = nums[0], c1 = 1, can2 = nums[0], c2 = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == can1) {
                c1++;
            } else if (nums[i] == can2) {
                c2++;
            } else if (c1 == 0) {
                can1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                can2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == can1) {
                c1++;
            } else if (nums[i] == can2) {
                c2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (c1 > n / 3) {
            result.add(can1);
        }
        if (c2 > n / 3) {
            result.add(can2);
        }

        return result;
    }
}
