class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        String str="";

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            str=str+s.charAt(i);
        }
        String str2="";
        int c=str.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                str2=str2+str.charAt(c-1);
                c--;
            }
            else
            str2=str2+s.charAt(i);
        }
        return str2;
    }
}