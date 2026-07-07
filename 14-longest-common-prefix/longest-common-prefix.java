class Solution {
    public  String longestCommonPrefix(String[] strings) {
        // 1. Handle base cases for the array itself
        if (strings == null || strings.length == 0) {
            return "";
        }

        String s = strings[0];

        // 2. Start loop from 1 instead of 0
        for (int i = 1; i < strings.length; i++) {
            // Safe check: If any element in the array is null, we cannot have a common prefix
            if (strings[i] == null) {
                return "";
            }

            // 3. Keep shortening the prefix until it is found at the very start (index 0)
            while (strings[i].indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);

                // If prefix shrinks to nothing, there is no common prefix
                if (s.isEmpty()) {
                    return "";
                }
            }
        }
        return s;
    }
}