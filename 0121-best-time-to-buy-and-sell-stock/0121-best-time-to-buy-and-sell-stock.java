class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0; // Initialize max profit to 0
        int ptr1 = 0, ptr2 = 1;

        if (n == 1) return 0;

        while (ptr2 < n) {
            if (prices[ptr1] < prices[ptr2]) {
                max = Math.max(max, prices[ptr2] - prices[ptr1]);
            } else {
                ptr1 = ptr2; // because we know prices[ptr2}<prices[ptr1] and we want lowest price while buying
            }
            ptr2++;
        }

        return max;
    }
}
