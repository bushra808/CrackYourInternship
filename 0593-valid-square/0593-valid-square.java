// class Solution {
//     public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) { 
//        int [][]diff=new int[2][4]; 
//        Set<Integer> set = new HashSet();
//        int flag=0;
//        int side = (int)(Math.ceil(Math.sqrt(Math.pow(Math.abs(p2[0] - p1[0]), 2) + Math.pow(Math.abs(p2[1] - p1[1]), 2))));
//        System.out.println(side);

//             for(int i=0;i<2;i++)
//             {
//                 diff[i][0]= Math.abs(p1[i]-p2[i]);
//                 diff[i][1]= Math.abs(p2[i]-p3[i]);
//                 diff[i][2]= Math.abs(p3[i]-p4[i]);
//                 diff[i][3]= Math.abs(p4[i]-p1[i]);
//             }

//             set.add(diff[0][0]+diff[1][0]);
//             set.add(diff[0][1]+diff[1][1]);
//             set.add(diff[0][2]+diff[1][2]);
//             set.add(diff[0][3]+diff[1][3]);
            
//             for(int i=0;i<2;i++)
//             {
//                 for(int j=0;j<4;j++)
//                 {
//                     System.out.print(diff[i][j]+" ");
//                 }
//                 System.out.println();
//             }
            
//             if(set.size()<=2){
//             flag=1;}

//             // for(int i=0;i<4;i++)
//             // {
//             //     if((diff[0][i]!=0 || diff[1][i]>=side) && flag==0
//             //     && (diff[1][i]!=0 || diff[0][i]>=side))
//             //     return false;
//             // }

//             if(!set.contains(0) && flag==0)
//             return false;
//     return true;
//     }
// }

class Solution {
    // This method returns true if the given 4 points form a square, false otherwise
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        // We use a set to store the distances between the points
        Set<Integer> set = new HashSet();
        // Calculate the distances between all pairs of points and add them to the set
        set.add(distanceSquare(p1,p2));
        set.add(distanceSquare(p1,p3));
        set.add(distanceSquare(p1,p4));
        set.add(distanceSquare(p2,p3));
        set.add(distanceSquare(p2,p4));
        set.add(distanceSquare(p3,p4));
        // A square must have 4 equal sides, so the set must contain 2 different values (the lengths of the sides and the diagonals)
        // The set should not contain 0, as that would mean that two points have the same coordinates
        return !set.contains(0) && set.size() == 2;
    }
    // This method calculates the distance between two points and returns its square
    private int distanceSquare(int[] a, int[] b){
        // We use the Pythagorean theorem to calculate the distance between the points
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}