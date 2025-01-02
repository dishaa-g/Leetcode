import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            result.add(Integer.parseInt(expression));
            return result;
        }

        for (int i = 0; i < expression.length(); i++) {
            char operator = expression.charAt(i);

            if (operator == '+' || operator == '-' || operator == '*') {
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));

                // Combine the results of the left and right subexpressions based on the operator
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (operator == '+') {
                            result.add(left + right);
                        } else if (operator == '-') {
                            result.add(left - right);
                        } else if (operator == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String expression1 = "2-1-1";
        String expression2 = "2*3-4*5";

        System.out.println(solution.diffWaysToCompute(expression1));  // Output: [0, 2]
        System.out.println(solution.diffWaysToCompute(expression2));  // Output: [-34, -14, -10, -10, 10]
    }
}
