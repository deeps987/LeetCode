class Solution {
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int cols=matrix[0].length;
         int[] col = new int[cols]; int[] row = new int[rows];  
        for(int i=0;i<cols;i++) col[i] = 1;    
        for(int i=0;i<rows;i++) row[i] = 1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}