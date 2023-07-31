class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //if she eats one pile one hour, min val of k can be len cause:
        //1) either she eats all
        //2) or she eats<=k, in this case total time>len
        int n=piles.length;
        int k=n;

        //do we start with k and increment it until koko ate all?
        //....like, for binary search, let's sort the array first

        
        if(h==n)
        {
        Arrays.sort(piles);
        return piles[n-1];
        }
         //no option left than to eat largest pile in 1 hour
        //else koko can eat< lar in 1 hr, aaram se
        
        int l = 1, r = 1000000000;
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles)
                total += (p + m - 1) / m;
            if (total > h)
                l = m + 1;
            else
                r = m;
        }
        return l;

    }
}