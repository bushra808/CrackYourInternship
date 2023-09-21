class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>> pascal=new ArrayList<>();
        int i=1;
        while(i<=n)
        {
            pascal.add(generateVal(i));
            i++;
        }
        return pascal;
    }
    public List<Integer> generateVal(int k)
    {
        // System.out.println("recursion");
        ArrayList<Integer> row = new ArrayList<>();
        int ans=1;
        row.add(ans);
        int p=k;
    
        for(int i=1; i<k; i++)
        {
            // System.out.println(k + "for i= "+i);
            ans=ans*(k-i); //k-i kyu?
            ans=ans/i;
            row.add(ans);
            p--;
        }
        return row;
    }
}