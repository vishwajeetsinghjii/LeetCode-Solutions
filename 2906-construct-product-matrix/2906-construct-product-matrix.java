class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;
        int[][] res = new int[n][m];
        
        //flattened grid

        int size = n*m;
        int[] arr = new int[size];
        int idx = 0;
     
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[idx++] = grid[i][j] % mod;
            }
        }

        //prefix product

        int[] prefix = new int[size];
        prefix[0] = 1;
        for(int i=1; i<size; i++){
            prefix[i] = (prefix[i-1] * arr[i-1]) % mod;
        }

        // suffix product

        int[] suffix = new int[size];
        suffix[size-1] = 1;
        for(int i=size-2; i>=0; i--){
            suffix[i] = (suffix[i+1]*arr[i+1]) % mod;
        }

        for(int i=0; i<size; i++){
            int val = (prefix[i] * suffix[i]) % mod;
            res[i/m][i%m] = val;
        }

        return res;

    }
}