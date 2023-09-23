class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pos=-1;

        //find the element which is smaller than its previous element
        for(int i=n-2; i>=0; i--)
        {
            if(nums[i]<nums[i+1])
            {
                pos=i;
                break;
            }
        }

        System.out.println(pos+" ");

        if(pos==-1)
        reverseSubarray(nums, 0, n-1);
        else
        {
            for(int i=n-1; i>=0; i--)
        {
            if(nums[i]>nums[pos])
            {
                int temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                break;
            }
        }

        reverseSubarray(nums, pos+1, n-1);
        }
    }

    public static void reverseSubarray(int[] arr, int x, int y) {
    if (x < 0 || x >= arr.length || y < 0 || y >= arr.length || x >= y) {
        // Invalid indices or empty subarray, do nothing
        return;
    }

    while (x < y) {
        // Swap elements at indices x and y
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

        // Move the indices towards each other
        x++;
        y--;
    }
}

}