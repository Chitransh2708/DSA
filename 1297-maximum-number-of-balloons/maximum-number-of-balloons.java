class Solution {
    public int maxNumberOfBalloons(String text) {
        int bestMin = Integer.MAX_VALUE;
        Map<Character, Integer> b1 = new HashMap<>();
        String s1 = "balloon";
        for(int i =0;i<=s1.length()-1;i++){
            char c = s1.charAt(i);
            b1.put(c, b1.getOrDefault(c,0)+1);

        }
        Map<Character, Integer> txt = new HashMap<>();
        for(int i =0;i<=text.length()-1;i++){
            char c = text.charAt(i);
            txt.put(c, txt.getOrDefault(c,0)+1);
        }

        for(char c : b1.keySet()){
            bestMin = Math.min(bestMin, txt.getOrDefault(c,0)/b1.get(c));
        }
        return bestMin == Integer.MAX_VALUE ? 0 : bestMin;
    }
}