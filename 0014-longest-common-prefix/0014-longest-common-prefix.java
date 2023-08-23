class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        for(int i=0;i<n;i++)
        {
            System.out.print(strs[i]+",");
        }

        char P,Q;
        int m=strs[0].length();
        int l=strs[n-1].length();
        int x=0;
        if(m<l)
        x=m;
        else
        x=l;
        String s="";
        for(int i=0;i<x;i++)
        {
            P=strs[0].charAt(i);
            Q=strs[n-1].charAt(i);
            if(P==Q)
            s=s+P;
            else
            break;
        }
        return s;
    }
}