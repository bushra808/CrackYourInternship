class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";
        String str="", str2="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(s.charAt(i-1)!=' ')
                {
                str2=s.charAt(i)+str+str2;
                str="";
                }
            }
            else
            str=str+s.charAt(i);
        }
        return str2.trim();
    }

   
}