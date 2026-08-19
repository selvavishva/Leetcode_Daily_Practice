class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<=Math.abs(n)){
                n=nums[i];
            }
        }
        return n;
    }
}