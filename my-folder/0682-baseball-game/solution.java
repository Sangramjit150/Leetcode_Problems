import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < operations.length; i++) {
            // 1. Corrected comparison using .equals() and && logic
            if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")) {
                int num = Integer.parseInt(operations[i].trim());
                res.add(num);
            }
            // 2. Used .equals() and adjusted indices relative to res.size()
            else if (operations[i].equals("+")) {
                int sum = res.get(res.size() - 1) + res.get(res.size() - 2);
                res.add(sum);
            }
            else if (operations[i].equals("D")) {
                int dob = 2 * res.get(res.size() - 1);
                res.add(dob);
            }
            else if (operations[i].equals("C")) {
                // Removes the last element safely
                res.remove(res.size() - 1);
            }
        }
        
        // Sum up all valid scores
        int totalSum = 0;
        for (int i = 0; i < res.size(); i++) {
            totalSum += res.get(i);
        }
        return totalSum;
    }
}

