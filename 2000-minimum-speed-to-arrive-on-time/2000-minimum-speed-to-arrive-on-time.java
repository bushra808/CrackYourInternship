import java.lang.*;

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        
        int left = 1, right = 10000000;
        int temp=-1;

        while (left <= right) {
            int mid = left + (right-left) / 2; // to prevent overflow in case both left and right are large values
            double t = 0.0;

            for (int i = 0; i < dist.length - 1; i++) {
                t += Math.ceil(dist[i] / (double) mid);
            }
            t += dist[dist.length - 1] / (double) mid;

            if (t <= hour) {
                right = mid-1; // we need to decrease speed to increase time (inversely proportional)
                temp = mid; // Store the correct value of mid at this point
            } else {
                left = mid + 1;
            }
        }

        return temp;
    }
}
