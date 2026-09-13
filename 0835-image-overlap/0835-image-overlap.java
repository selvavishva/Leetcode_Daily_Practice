class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;
        int max = 0;

        for(int x = -n; x <= n; x++){

            for(int y = -n; y <= n; y++){

                int count = 0;

                for(int i = 0; i < n; i++){

                    for(int j = 0; j < n; j++){

                        int ni = i + x;
                        int nj = j + y;

                        if(ni >= 0 && ni < n && nj >= 0 && nj < n){

                            if(img1[i][j] == 1 && img2[ni][nj] == 1){
                                count++;
                            }
                        }
                    }
                }

                if(count > max){
                    max = count;
                }
            }
        }

        return max;
    }
}

//34test case pass my method

//   int count=0;
//         for(int i=0;i<img1.length;i++){
//             for(int j=0;j<img2.length;j++){
//                 if(img1[i][j]==1 && img2[i][j]==1)
//                 count++;
                
//             }
//         }
//         return count;