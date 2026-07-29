class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
       int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
          if (i != j && i != k && j != k){
            int value=nums[i]+nums[j]-nums[k];
           if(value>ans) ans=value;
          }
        }
        }
    }
        return ans;
    }
}