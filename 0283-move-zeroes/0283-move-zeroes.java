// class Solution {
//      public void moveZeroes(int[] nums) {
//         int snowBallSize = 0; 
//         for (int i=0;i<nums.length;i++){
// 	        if (nums[i]==0){
//                 snowBallSize++; 
//             }
//             else if (snowBallSize > 0) {
// 	            int t = nums[i];
// 	            nums[i]=0;
// 	            nums[i-snowBallSize]=t; //i change krne ki zaroorat hi ni h its so simple good lord
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        
       // method :1 
        int count = 0;
        
            for(int i = 0; i<nums.length; i++){
                if(nums[i]!= 0){
                    nums[count++] = nums[i]; 
                }
            }
     while(count<nums.length) {
           nums[count++] = 0;
        }
    }
}