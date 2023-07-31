class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int res=0;
        // Add elements from nums array to the HashSet
        for (int num : nums) {
            set.add(num);
        }
        
        for (int num : nums) {
            if(!set.contains(num-1)) //if set does not contain prev no means it is the start of a sequence
            {
                int sub=1;
                int val=num;
                while(set.contains(val+1)){
                sub++;
                val++;
                }
            res=Math.max(res, sub);
            }
        }
        return res;
    }
}