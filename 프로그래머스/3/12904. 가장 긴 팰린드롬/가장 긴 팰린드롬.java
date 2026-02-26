class Solution {
    public int solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            sb.append('#').append(c);
        }
        sb.append('#');
        
        String t = sb.toString();
        
        int maxLen = 1;
        
        for (int i = 0; i < t.length(); i++) {
            int left = i;
            int right = i;
            
            while (left >= 0 && right < t.length() && t.charAt(left) == t.charAt(right)) {
                left--;
                right++;
            }
            
            int rLen = (right - left - 1) / 2;
            maxLen = Math.max(maxLen, rLen);
        }
        
        return maxLen;
    }
}