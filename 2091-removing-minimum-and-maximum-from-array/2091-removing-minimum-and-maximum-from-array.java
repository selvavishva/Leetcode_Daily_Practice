class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]<nums[min]){
                    min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        int a=Math.max(max,min)+1;
        int b=nums.length-Math.min(max,min);
        int c=Math.min(max,min)+1+nums.length-Math.max(max,min);

        n=Math.min(a,Math.min(b,c));
        return n;
    }
}