class Solution {
    public boolean checkIfPangram(String sen) {
       
        for(char ch='a';ch<='z';ch++){
            boolean bool=false;
            for(int j=0;j<sen.length();j++){
            if(ch==sen.charAt(j)){
            bool= true;
            break;
            }
        }
          if(bool==false) 
            return false;
        }
        return true;
    }
}