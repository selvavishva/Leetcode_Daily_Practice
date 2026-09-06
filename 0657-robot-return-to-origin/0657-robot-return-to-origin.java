class Solution {
    public boolean judgeCircle(String moves) {
          int x=0;
          int y=0;
        for(int i=0;i<moves.length();i++){
          char ch1=moves.charAt(i);
        
            if(ch1=='U')
            y++;
            else if(ch1=='D')
            y--;
            else if(ch1=='L')
            x--;
          else if(ch1=='R')
          x++;
        }
        return x==0&&y==0;
    }
}