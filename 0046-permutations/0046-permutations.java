class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>(); //for answer
        List<Integer> ds=new ArrayList<>(); // a data struture to store individual permutations
        boolean freq[]=new boolean[nums.length]; //freq to mark elements
        recurpermute(nums, ds, ans, freq);
        return ans;
        
    }

    public void recurpermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq)
    {
        if(ds.size()==nums.length) //base case
        {
            ans.add(new ArrayList<>(ds)); //add data str to ans
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i]) //not marked
            {
                freq[i]=true; //mark it
                ds.add(nums[i]); //add unmarked ele to ds
                recurpermute(nums, ds, ans, freq); //call recursive
                ds.remove(ds.size()-1); //remove the element we added
                freq[i]=false; //unmark it
            }
        }
    }


}