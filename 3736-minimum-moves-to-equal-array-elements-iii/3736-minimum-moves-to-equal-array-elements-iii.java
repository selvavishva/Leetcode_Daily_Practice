class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
           if(nums[i]>max)
           max=nums[i];
        }
        return (max*nums.length)-sum;
    }
}