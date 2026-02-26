class Solution {
    public boolean isPalindrome(String s) {

        int lp = 0;
        int rp = s.length() -1;

        while (lp < rp) {
            char left = s.charAt(lp);
            char right = s.charAt(rp);

            if (!Character.isLetterOrDigit(left)) {
                lp++;
                continue;
            }

            if (!Character.isLetterOrDigit(right)) {
                rp--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            lp++;
            rp--;
        }
        return true;
        
    }
}
