class Solution {
    public String removeDuplicates(String s, int k) {

        int count = 0;
        StringBuilder sb = new StringBuilder();
        Stack<int[]> st = new Stack<>();
       

        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            if(st.empty() || st.peek()[0] != c){
                st.push(new int[]{c,1});

            }
            else{
                st.peek()[1]++;

                if(st.peek()[1] == k){
                    st.pop();
                }
            }
            
        }

        while (!st.empty()) {
            int pair[] = st.pop();
            int freq = pair[1];
            char c = (char) pair[0];

            while(freq>0){
                sb.append(c);
                freq--;
            }
          
        }
          sb.reverse();
        return sb.toString();

    }
}