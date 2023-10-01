class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=1; i<=n; i++)
        arr.add(i);

        StringBuilder s = new StringBuilder();
       while (n > 0) {
            int fact = factorial(n - 1);
            int index = (k - 1) / fact; // Calculate the index
            s.append(arr.get(index));
            arr.remove(index);
            k = k - index * fact; // Update k for the next iteration
            n--;
        }
        return s.toString();
    }

    public int factorial(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        f=f*i;

        return f;
    }
}
