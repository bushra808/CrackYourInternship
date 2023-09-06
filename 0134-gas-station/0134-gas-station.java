class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0, sum2=0;

        for(int i=0; i<gas.length; i++)
        {
        sum1+=gas[i];
        sum2+=cost[i];
        }

        if(sum2>sum1)
        return -1;

        int sum=0, idx=0;

        for(int i=0; i<gas.length; i++)
        {
         sum+=gas[i]-cost[i];
         if(sum<0)
         {
             idx=i+1;
             sum=0;
         }   
        }
        return idx;
    }
}