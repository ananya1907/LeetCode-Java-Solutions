/*Ananya Gupta*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
            for(int i=0; i<mat.length; i++){
                 sum+= mat[i][i];           
            }
            int temp=mat.length;
            for(int i=0; i<mat.length; i++){
                    temp--;
                    if(i!=temp){
                            sum+=mat[i][temp];
                    }
            }
            return sum;
    }
}
