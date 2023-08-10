class Solution {
    public String mergeAlternately(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        int n=Math.max(l1,l2);
        int m=Math.min(l1,l2);
        String s="";
        for(int i=0;i<n;i++)
        {
            if(m==0 && l1!=l2)
            {
                if(l1>l2)
                s=s+s1.substring(l2,l1);
                else
                s=s+s2.substring(l1,l2);

                break;
            }
            else
            {
            s=s+s1.charAt(i)+s2.charAt(i);
            m--;
            }
        }
        return s;
    }
}