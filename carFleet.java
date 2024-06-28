class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;
        
        int count = 0;
        double[] time = new double[n];
        
        for (int i = 0; i < n; i++) {
            time[i] = (double) (target - position[i]) / speed[i];
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (position[j] < position[j + 1]) {
                    int tempPos = position[j];
                    position[j] = position[j + 1];
                    position[j + 1] = tempPos;
                    
                    double tempTime = time[j];
                    time[j] = time[j + 1];
                    time[j + 1] = tempTime;
                }
            }
        }
        
        double fleetTime = 0;
        for (int i = 0; i < n; i++) {
            if (time[i] > fleetTime) {
                fleetTime = time[i];
                count++;
            }
        }
        
        return count;
    }
}
