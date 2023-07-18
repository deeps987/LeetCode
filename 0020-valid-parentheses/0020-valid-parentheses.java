class Solution {
    public boolean isValid(String s) {
            Stack <Character>s1= new Stack <Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                s1.push(ch);
            else if(ch == ')' &&s1.size()>0 && s1.peek() == '(' ) 
                s1.pop();
            else if (ch == '}' &&s1.size()>0 && s1.peek() == '{') 
                s1.pop();
            else if (ch == ']' && s1.size()>0 && s1.peek() == '[')
                s1.pop();
            else 
                return false;
                
            }
        
        if (s1.empty())
            return true;
        return false;
    }
}