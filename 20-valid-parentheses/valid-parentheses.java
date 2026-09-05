class Solution {
    public boolean isValid(String s) {
        boolean b = true;
        if(s.length()<=1 ){
            return false;
        }

        Stack<Character> st = new Stack<>();
        for(int i =0;i<=s.length()-1;i++){
            char c = s.charAt(i);
            if(st.empty()){
                st.push(c);
            }
            else if(c == '{' || c=='[' || c=='('){
                st.push(c);
            }
            else if(c == ')'){
                if(st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
                
            }
            else if(c == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
                
            }
            else if(c == ']'){
                if(st.peek() == '['){
                    st.pop();
                }

                else{
                    return false;
                }
                
            }
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }


        
    }
}