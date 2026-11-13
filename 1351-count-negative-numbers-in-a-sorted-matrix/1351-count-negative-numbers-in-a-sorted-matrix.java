class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        
       for (int row = 0; row < grid.length; row++){
        
            int s = 0;
            int e = grid[row].length - 1;
            int totalColumns = grid[row].length;

            while (s <= e) {
                int mid=s+(e-s)/2;

                if (grid[row][mid] < 0){
                     e=mid-1;
                }
                else{
                    s=mid+1;


                }
    
            }
            count += totalColumns - s;
       }
       return count;
        
    }
}