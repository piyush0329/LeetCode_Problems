class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp1 =0;
                temp1=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp1;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp2 =0;
                temp2= matrix[i][j];
                matrix[i][j]= matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp2;
            }
        }
    }
}