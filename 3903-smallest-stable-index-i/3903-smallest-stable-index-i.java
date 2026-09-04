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

//My method only 70 test case pass 
        // int sum=0;
        // int n=nums[0];
        // int min=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>k)
        //         sum=n-nums[i];
        //         if(min<=k)
        //         min=sum;
        //         sum=k;
        //     }
        // }
        // return sum;