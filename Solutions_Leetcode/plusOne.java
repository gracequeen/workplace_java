/* Given a non-negative number represented as an array of digits, plus one to the number.

* The digits are stored such that the most significant digit is at the head of the list.
*/
public class plusOne{
	public static int[] plusOne(int[] digits) {
		int carry = 0;
		int i = digits.length - 1;

		if (digits[i] != 9) {
			digits[i] += 1;
			return digits;
		} else {
			digits[i] = 0;
			carry += 1;
			for (int k = i - 1; k >= 0; k--) {
				if(digits[k] != 9) {
					digits[k] += 1;
					carry -= 1;
				} else {
						digits[k] = 0;
				}
				
				if (carry == 0) {
					break;				
				}			
			} // close for
			if (digits[0] != 0) {
				return digits;
			} else {
				int[] result = new int[digits.length + 1];
				result[0] = 1;
				return result;
			} // close if-else
	
		} // close if-else
	} // close plusOne method

	public static void main(String[] args) {
		int[] n = {1, 8, 9, 9};
		int[] r = plusOne(n);
		for (int k = 0; k < r.length; k++) {
			System.out.print(r[k] + ",");
		} // close for
	} // close main
}