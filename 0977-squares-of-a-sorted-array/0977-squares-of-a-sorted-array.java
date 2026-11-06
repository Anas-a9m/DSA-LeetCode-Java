class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length; 
        int j=0;
        int[] arr = new int [n];
        for(int i=0;i<n;i++){
            int sqr=nums[i]*nums[i];
            arr[j] =sqr;
            j++;
        }
        Arrays.sort(arr);
        return arr;
        
    }
}