class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[]=new int[2];
        int n=numbers.length;
        int k=0;
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(target-numbers[i]))
            {
                res[0]=h.get(target-numbers[i])+1;
                res[1]=i+1;
                break;
            }
            h.put(numbers[i],i);
        }
        return res;
    }
}