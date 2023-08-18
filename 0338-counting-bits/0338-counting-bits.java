class Solution {
    public int[] countBits(int n) {

        int[] ans=new int[n+1];
        int i=0;
        while(i<=n)
        {
            ans[i]=noOfOnesBinary(i);
            i++;
        }
        return ans;
    }

    public int noOfOnesBinary(int n)
    {
        String binary = Integer.toBinaryString(n);
        int countOnes = binary.replace("0", "").length();
        return countOnes;
    }
}