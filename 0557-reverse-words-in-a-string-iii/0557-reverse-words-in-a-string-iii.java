class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        int n=s.length();
        String rev="";
        String s1="";
        for(int i=0; i<n; i++)
        {
            char P=s.charAt(i);
            if(P!=' ')
            {
                s1=P+s1;
            }
            else
            {
                rev=rev + s1 + P;
                s1="";
            }
        }

        return rev.trim();
    }
}