class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        // HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
            arr.add(index+1);
            nums[index]=-nums[index];
        }
        return arr;
    }
}