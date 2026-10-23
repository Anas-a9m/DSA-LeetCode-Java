class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro =1;
        int ans = 0;
        while(n>0){
            int digit= n%10;
                    n= n/10;

            pro = digit *pro;
            sum = digit + sum;

             ans = pro-sum;


        }
        return ans;
        
    }
}