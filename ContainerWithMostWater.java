class Solution {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = height.length - 1; 
        int maxArea = 0; 

        
        while (left < right) {
            
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

           
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea; 
    }
}
