class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] ugly = new int[n];
        ugly[0] = 1;
        
        int p2 = 0, p3 = 0, p5 = 0; // Pointers for factors 2, 3, and 5
        
        for (int i = 1; i < n; i++) {
            // Find the next ugly number by selecting the minimum of the current multiples
            int nextUgly = Math.min(ugly[p2] * 2, Math.min(ugly[p3] * 3, ugly[p5] * 5));
            ugly[i] = nextUgly;

            // Update pointers to the next possible multiples
            if (nextUgly == ugly[p2] * 2) {
                p2++;
            }
            if (nextUgly == ugly[p3] * 3) {
                p3++;
            }
            if (nextUgly == ugly[p5] * 5) {
                p5++;
            }
        }

        return ugly[n - 1];
    }
}
