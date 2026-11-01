class Solution {
    public int minMoves(int[] nums) {
       int min=Integer.MAX_VALUE;
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];  
        } 
       }
        for(int i=0;i<nums.length;i++){
            count=count+nums[i]-min;
       } 
     return count;
    }
}


//my version only 5 test case pass
// class Solution {
//     public int minMoves(int[] nums) {
//        int min=Integer.MAX_VALUE;
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){
//         if(nums[i]<nums[j]){
//             count++;
//             min=count;
            
//         }else{
//             return 0;
//         }
//         }
//        } 
//      return min;
//     }
// }