class Solution {
    public boolean uniformArray(int[] nums) {
        boolean bool=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]%2==0)
                return true;
                if(nums[j]%2==0) return true;
            }
        }
        return true;
   }
}