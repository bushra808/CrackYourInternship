class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(n==1 && m==1)
        {
            return haystack.charAt(0)==needle.charAt(0)? 0 : -1;
        }
        for(int i=0;i<=n-m;i++)
        {
            String s="";
            for(int j=i;j<i+m;j++)
            {
                s+=haystack.charAt(j);
            }
            if(s.equals(needle))
            return i;
        }
        return -1;
    }
}