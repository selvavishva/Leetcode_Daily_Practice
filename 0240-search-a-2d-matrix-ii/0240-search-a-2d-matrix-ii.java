class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        boolean bool=false;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){ //m[i] it will check current col and row but m.length 
                if(m[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}