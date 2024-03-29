//Unique character in string:
/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 
Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
●	1 <= s.length <= 105
●	s consists of only lowercase English letters.
*/
class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q=new LinkedList<>();
         int freq[] = new int [26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            q.remove();
        }
        return q.isEmpty()?-1:s.indexOf(q.peek());
    }
}
