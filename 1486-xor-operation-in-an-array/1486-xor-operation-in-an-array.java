class Solution {
    public int xorOperation(int n, int start) {
       int nes=0;
        for(int i=0;i<n;i++){
        int nums=start+2*i;
        nes=nes^nums;
        }
        return nes;
    }
}