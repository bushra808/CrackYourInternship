class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int c=0;
        String p="";
        if(n==0)
        return true;
        else
        {
        for(int i=0; i<m; i++)
        {
                if(s.charAt(c)==t.charAt(i))
                {
                p=p+s.charAt(c);
                System.out.println(p+ " "+c);
                if(c>=n-1)
                return true;
                else
                c++;
                }
        }
        return false;
        }
    }
}