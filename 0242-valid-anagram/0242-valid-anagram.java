class Solution {
    public boolean isAnagram(String s, String t) {
          
          if(s.length()!=t.length()) return false;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
         if(count[i]!=0) return false;
        }
        return true;
    }
}


// class Solution {
//     public boolean isAnagram(String s, String t) {
          
//           if(s.length()!=t.length()) return false;

//         char[] arr=s.toCharArray();
//         char[] arr1=t.toCharArray();

//         Arrays.sort(arr);
//         Arrays.sort(arr1);
    
//         return Arrays.equals(arr,arr1);
//     }
// }