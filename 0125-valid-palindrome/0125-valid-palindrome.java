class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String cleaned = sb.toString();

        int lp = 0;
        int rp = cleaned.length() - 1;

        while (lp < rp) {
            if (cleaned.charAt(lp) != cleaned.charAt(rp)) {
                return false;
            }
            lp++;
            rp--;
        }

        return true;
    }
}