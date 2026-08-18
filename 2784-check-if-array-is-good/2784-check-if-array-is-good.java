class Solution {
    public boolean isGood(int[] nums) {

        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        if(max != nums.length - 1) {
            return false;
        }

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == max) {
                count++;
            }
        }

        if(count != 2) {
            return false;
        }

        for(int i = 1; i < max; i++) {

            boolean found = false;

            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                return false;
            }
        }

        return true;
    }
}