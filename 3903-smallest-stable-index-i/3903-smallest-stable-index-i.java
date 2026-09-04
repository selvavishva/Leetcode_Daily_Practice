class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[0];
            min=nums[i];
            for(int j=0;j<=i;j++){
                if(nums[j]>max)
                max=nums[j];
            }
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min)
                min=nums[j];
            }
            if(max-min<=k) return i;
        }
        return -1;
    }
}