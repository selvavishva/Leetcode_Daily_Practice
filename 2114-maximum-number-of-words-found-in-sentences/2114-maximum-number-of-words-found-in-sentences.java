class Solution {
    public int mostWordsFound(String[] sen) {
        int max=0;
        for(int i=0;i<sen.length;i++){
            int count=1;
         for(int j=0;j<sen[i].length();j++){
          if(sen[i].charAt(j)==' ')
            count++;
        }
        if(count>max)
        max=count;
        }
        return max;
    }
}