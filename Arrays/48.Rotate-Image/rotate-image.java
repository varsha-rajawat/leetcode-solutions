class Solution {
    public void rotate(int[][] matrix) {
        //step 1 - transpose - row -> col
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }               
            }
        }

        //step 2 - reverse
     
        for(int i=0; i<n; i++){
            int k=0;
            for(int j=n-1; j>k; j--){       
            int temp = matrix[i][k];
            matrix[i][k] = matrix[i][j];
            matrix[i][j] = temp;
            k++;
            }
        }
    }
}