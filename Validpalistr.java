// 125. Valid Palindrome
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.

class Validpalistr {
    class Solution {
    public boolean isPalindrome(String s) {
       String str=s.toLowerCase();      //it convert uppercase to lower
       str=str.replaceAll("[^a-z0-9]","");  //replace ^- not,it change lowertoupper upper to lower

        for(int i=0;i<str.length()/2;i++){     //why /2? the palindrome check only half sentence
        //Ex: rac  car
         //   i-->* run half point starting and ending   
              
                if(str.charAt(i)!=str.charAt(str.length()-1-i))  //compare it's fail false
                 return false;
            }
             return true;  //else true
        }
    }

}
