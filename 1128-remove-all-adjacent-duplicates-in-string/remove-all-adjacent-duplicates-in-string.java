class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        
        

        for(int k =0;k<=s.length()-1;k++){
            char c = s.charAt(k)   ;
            if(st.empty()){
                st.push(c);
            }
            else if(c == st.peek()){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder result = new StringBuilder();

        for(char c: st){
            result.append(c);
        }

        return result.toString();
    }
}