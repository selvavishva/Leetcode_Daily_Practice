class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean bool=false;
        for(int i=0;i<rec1.length;i++){
            for(int j=0;j<rec2.length;j++){
                if(rec1[0]<rec2[2] && rec2[0]<rec1[2] && rec1[1]<rec2[3]&&rec2[1]<rec1[3]){  
// in simple x1=0andx3=2 compare this then compare x2=1 and x4=3 
                    return true;
                }

            }
        }
        return false;
    }
}


// my approach 7testcase pass
//  boolean bool=false;
//         for(int i=0;i<rec1.length;i++){
//             for(int j=0;j<rec2.length-1;j++){
//                 if(rec1[i]==rec2[j]){
//                     rec1[i]=rec2[j+1];
//                     return true;
//                 }

//             }
//         }
//         return false;
//     }