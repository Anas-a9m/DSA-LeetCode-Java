class Solution {
static int lowerBound(int[] nums, int x) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(nums[mid]>=x){
                ans=mid;
                e=mid-1;
            }
            
            
            else{
                s=mid+1;
            }
        }
        
        return s;
       
     }
static int upperBound(int[] nums, int x) {
         int n=nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(nums[mid]<=x){
                s= mid+1;
            }
            else{
                ans = mid;
                e=mid-1;
            }
        }
        
        return s;
  
    }
    public int[] searchRange(int[] nums, int target) {
        
        int lbindex = lowerBound(nums,target);
         if(lbindex == nums.length || nums[lbindex] != target) {
            return new int[]{-1, -1};
        }
        int ubindex =upperBound(nums,target);
        return new int[]{lbindex, ubindex - 1};
    
    }
}