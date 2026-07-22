class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot=0;
        for(int n:nums){
            tot=tot+n;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            tot=tot-nums[i];
            if(tot==sum){
                 return i;
            }
            sum=sum+nums[i];
        }
        return -1;
    }
}