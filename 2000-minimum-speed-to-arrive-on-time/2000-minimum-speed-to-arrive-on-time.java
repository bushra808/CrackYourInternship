class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length > Math.ceil(hour)) {
            return -1;
        }

        int left = 1, right = (int) 10e7 + 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(binarySearch(dist, mid, hour)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean binarySearch(int[] dist, int target, double hour) {
        double time = 0;
        for(double d : dist) {
            time = Math.ceil(time);
            time += d / target;
        }
        return time <= hour;
    }
}