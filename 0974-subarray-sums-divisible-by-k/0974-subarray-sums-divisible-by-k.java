class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int subcount = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {

            sum += nums[i];
            int rem = (sum % k + k) % k;

            if(rem==0)
            subcount++;
            
            int count = map.getOrDefault(rem, 0);
            subcount += count;
            
            map.put(rem, count + 1);
        }

        return subcount;
    }
}

