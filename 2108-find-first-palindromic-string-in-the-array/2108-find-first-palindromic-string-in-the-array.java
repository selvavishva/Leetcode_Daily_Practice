class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
           String word=words[i];
              String rev="";
              for(int j=word.length()-1;j>=0;j--){
                rev=rev+word.charAt(j);
              }
              if(word.equals(rev)){
                return word;
              }
        }
        return "";
    }
}
