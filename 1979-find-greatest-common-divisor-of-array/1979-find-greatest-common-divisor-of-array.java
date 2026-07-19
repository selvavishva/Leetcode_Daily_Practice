class Solution {
    public int findGCD(int[] nums) {
       int n1=nums[0];
       int n2=nums[0];
        for(int i=0;i<nums.length;i++){
           if(nums[i]<n1)
           n1=nums[i];

           if(nums[i]>n2)
           n2=nums[i];
        }
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        return n1;
    }
}