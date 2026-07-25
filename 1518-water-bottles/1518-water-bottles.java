class Solution {
    public int numWaterBottles(int num, int ex) {
       int ans=num;
       int empty=num;
        while(empty>=ex){
          int Bottle=empty/ex;
          ans=ans+Bottle;
          empty=(empty%ex)+Bottle;
        }
        return ans;
    }
}

// class Solution {
//     public int numWaterBottles(int bot, int ex) {
//         int count=0;
//         int rem=0;
//         System.out.println(bot%ex);
//         count=count+bot;
//         while(bot>=ex){
//             rem=bot%ex;
//             bot=bot/ex;
//             count=count+bot;
//             bot=bot+rem;
//         }
//         return count;
//     }
// }