import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        // Handle empty input string
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        // Map phone digits to letters
        Map<Character, String> phoneMap = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );

        // Initialize combinations with an empty string
        List<String> combinations = new ArrayList<>();
        combinations.add("");

        // Iterate through each digit in the input string
        for (char digit : digits.toCharArray()) {
            List<String> newCombinations = new ArrayList<>();
            String letters = phoneMap.get(digit);

            // Build new combinations by appending letters
            for (String combination : combinations) {
                for (char letter : letters.toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }
            combinations = newCombinations;
        }

        return combinations;
    }
}
