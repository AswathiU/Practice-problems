//Delete consecutive words:

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

