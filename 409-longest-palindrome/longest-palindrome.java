class Solution {
    public int longestPalindrome(String s) {

        Map<Character, Integer> mp = new HashMap<>();
        
        int sum = 0;
        boolean hasOdd = false;
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : mp.keySet()) {
            if (mp.get(c) % 2 == 0) {
                sum = sum + mp.get(c);
                
            } else {
                sum = sum + mp.get(c)-1;
                hasOdd = true;
                

            }
            
            }
            if(hasOdd){
                sum++;
            }
        
        return sum;

    }
}