//Delete consecutive words:
Given a sequence of n strings, the task is to check if any two similar words come together and then destroy each other then print the number of words left in the sequence after this pairwise destruction.
Examples: 
Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.
Input :  tom jerry jerry tom
Output : 0


class Solution 
{
    static int removeConsecutiveSame(Vector <String > v) 
    {
        Stack<String> st=new Stack<>();
     for(String str:v)
     {
         if(!(st.empty()) && st.peek().equals(str))
         {
             st.pop();
         }
         else
         st.push(str);
     }
     return st.size();
    }
}

