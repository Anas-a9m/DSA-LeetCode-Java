class Solution {
    public boolean isHappy(int n) {
        int sqr = 0;
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int sum=0;
            int temp=n;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            while(temp>0){
                int digit = temp%10;
                 temp = temp/10;
                 sqr = digit *digit;
                  sum=sum+sqr;
                  
                 
            }
            n = sum;
            

          
         
            }
            return true;
        
    }
}