class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int i=0;
        int j=n-1;
        int currentarea=0;
         int maxarea =0;

        while (i<j){

            int width = j-i;
            currentarea = width * Math.min(height[i], height[j]);
             maxarea = Math.max(maxarea, currentarea);
          
            if (height[i] < height[j]){
            i++;
           }
           else{
            j--;
           }

        }
        return maxarea;
    }
}