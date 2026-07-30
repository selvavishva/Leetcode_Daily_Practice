class Solution {
    public int minimumPushes(String word) {
       /* int count=0;
        int pushes=0;
        String str=word.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>0) 
           pushes=pushes+(i/8)+1;
        }
        return pushes;*/
         String str=word.toLowerCase();
         int mama=0;
         for(int i=0;i<str.length();i++){
            mama=mama+(i/8)+1;
         }
         return mama;
    }
}