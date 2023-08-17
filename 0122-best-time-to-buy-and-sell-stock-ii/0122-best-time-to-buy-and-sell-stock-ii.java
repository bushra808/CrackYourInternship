class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ptr1=0, ptr2=1;
        int profit=0;
        while(ptr2<n)
        {
            if(prices[ptr2]-prices[ptr1]>0) //profit
            {
                profit+=prices[ptr2]-prices[ptr1];
                ptr1++;
            }
            else
            {
                ptr1=ptr2;
            }
            ptr2++;
        }
        return profit;
    }
}