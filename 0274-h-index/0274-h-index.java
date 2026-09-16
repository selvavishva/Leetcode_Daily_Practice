class Solution {
    public int hIndex(int[] nums) {
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        int paper=nums.length -i;
        if(nums[i]>=paper){
            return paper;
        }
       }
       return 0;
    }
}