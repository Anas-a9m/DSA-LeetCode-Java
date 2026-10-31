class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;

        int arr[] = new int[n];

        int index = 0;
        
        for(int i=n-k;i<n;i++){
             arr[index]= nums[i];
            index++;

        }
        for(int i=0;i<n-k;i++){
            arr[index] = nums[i];
            index++;
        }

        for(int i = 0; i < n; i++) {

            // arr se nums mein copy karo
            nums[i]=arr[i];
        }
        
    }
}