class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        int nums[]={1,2,3,4,5,6,7,8,9};
        findCombinations(nums, 0, ans, new ArrayList<>(), k, n);
        return ans;
    }

    public void findCombinations(int[] nums, int i, ArrayList<List<Integer>> ans, ArrayList<Integer> currSet, int k, int n)
    {
        if(n==0 && k==0) //base case
        {
            ans.add(new ArrayList<>(currSet)); //add copy of currSet to ans
            return;
        }

        if(n<0 || i==nums.length)
        return;

        currSet.add(nums[i]);
        findCombinations(nums, i+1, ans, currSet, k-1, n-nums[i]);

        currSet.remove(currSet.size()-1);
        findCombinations(nums, i+1, ans, currSet, k, n);
    }

    
}