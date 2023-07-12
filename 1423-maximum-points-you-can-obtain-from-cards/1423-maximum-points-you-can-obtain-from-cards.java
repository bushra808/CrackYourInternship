class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int L=0;
        int R=n-k-1;
        int max=0;
        int score=0;
        for(int i=n-1;i>n-k-1;i--)
        {
            score=score+cardPoints[i];
        }
        max=score;
        // System.out.println(max+"");
       for(int i=0;i<k;i++)
       {
           score=score-cardPoints[n-k+i]+cardPoints[i];
           max=Math.max(max,score);
                // System.out.?println(max+"");
       }
        
        return max;
    }
}