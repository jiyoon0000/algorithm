class Solution {
    public int solution(String s) {
        int answer = s.length();
        int len = s.length();
        
        if (len == 1) return 1;
        
        for (int r = 1; r <= len / 2; r++) {
            String pattern = s.substring(0,r);
            int c = 1;
            
            StringBuilder sb = new StringBuilder();
            
            int i;
            
            for (i = r; i + r <= len; i += r) {
                String cur = s.substring(i, i + r);
                
                if (pattern.equals(cur)) {
                    c++;
                } else {
                    if (c > 1) sb.append(c);
                    sb.append(pattern);
                    
                    pattern = cur;
                    c = 1;
                }
            }
            
            if (c > 1) sb.append(c);
            sb.append(pattern);
            
            sb.append(s.substring(i));
            
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}