class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); // Remove leading/trailing spaces if necessary
        
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenE = false;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                seenDigit = true;
                
            } else if (ch == '+' || ch == '-') {
                // Signs can only appear at the very start, or right after an exponent 'e'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                
            } else if (ch == 'e' || ch == 'E') {
                // 'e' can only appear once, and must follow at least one digit
                if (seenE || !seenDigit) {
                    return false;
                }
                seenE = true;
                seenDigit = false; // Reset to ensure a number follows the exponent (e.g., "1e" is invalid)
                
            } else if (ch == '.') {
                // Dot can only appear once and cannot appear after an exponent 'e'
                if (seenDot || seenE) {
                    return false;
                }
                seenDot = true;
                
            } else {
                // Any other character (letters, symbols) makes it invalid
                return false;
            }
        }
        
        // The string is valid only if we ended with a valid digit sequence
        return seenDigit;
    }
}
