class Solution {
    public int maxPalindromes(String s, int k) {

        int max = 0;
        int lastEnd = -1;

        for(int j = 0; j < s.length(); j++) {

            for(int i = j - k + 1; i >= lastEnd + 1; i--) {

                String rev = "";

                for(int x = j; x >= i; x--) {
                    rev = rev + s.charAt(x);
                }

                String sub = s.substring(i, j + 1);

                if(sub.equals(rev)) {
                    max++;
                    lastEnd = j;
                    break;
                }
            }
        }

        return max;
    }
}