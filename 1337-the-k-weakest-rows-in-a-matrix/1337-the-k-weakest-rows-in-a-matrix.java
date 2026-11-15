class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int[][] arr = new int[m][2];
        
        for(int i=0;i<m;i++){
            int n=mat[i].length;
            int rowSolder=0;
            
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    rowSolder++;

                }
            }
            arr[i][0]=rowSolder;
            arr[i][1]=i;
          
            
                
            

        }
        Arrays.sort(arr, (a, b) -> {
            if(a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
                ans[i] = arr[i][1];
        }

        return ans;
        
        
    }
}