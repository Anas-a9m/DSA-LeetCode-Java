class Solution {
    static boolean isvalidAnswer(int[] nums,int k,int maxPages){
        int studentCount=1;
        int totalPages=0;
        for(int i=0;i<nums.length;i++){
            if(totalPages+nums[i]<=maxPages){
                totalPages=totalPages+nums[i];
            }
            else{
                studentCount++;
                if(studentCount>k|| nums[i]>maxPages){
                    return false;
                }
               else{              
                      totalPages=0;
                     totalPages=totalPages+nums[i];
               }
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
         if(nums.length<k){
            return -1;
        }
        int n=nums.length;
        int s=0;
        int sum=0;
        
            for(int i=0;i<n;i++){
            sum = sum+nums[i];
            }
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalidAnswer(nums,k,mid)){
                ans= mid;
                e=mid-1; 
            }
            else{
                s=mid+1;
            }
        }
        return ans;
   
    }
        
    
}