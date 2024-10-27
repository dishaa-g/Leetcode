import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      StringBuilder numberStr = new StringBuilder();
        for (int digit : num) {
            numberStr.append(digit);
        }

        // Step 2: Convert the number string to BigInteger and add one
        BigInteger bigNumber = new BigInteger(numberStr.toString());
        BigInteger incrementedNumber = bigNumber.add(BigInteger.valueOf(k));

        // Step 3: Convert the incremented number back to List<Integer>
        List<Integer> digitList = new ArrayList<>();
        for (char digitChar : incrementedNumber.toString().toCharArray()) {
            digitList.add(Character.getNumericValue(digitChar));
        }
    
        return digitList;
       
    }
}