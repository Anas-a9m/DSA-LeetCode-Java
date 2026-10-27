class Solution {

    private boolean isselfdividing(int n){
        int num = n;
        while(num>0){
            int digit = num%10;
            num = num/10;
            if(digit==0 || n%digit!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> temp = new ArrayList<>();
        for (int i=left;i<=right;i++){
            if(isselfdividing(i)==true){
                temp.add(i);
            }
        }
        return temp;
    }
}