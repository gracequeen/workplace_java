public class solution1 {
	public boolean isPalindrome(String s) {
		int start_index = 0;
		int end_index = s.length() - 1;

		// first test the two sides
		if (s[start_index] != s[end_index]) {
			return false;
		} else {
			
		}

	}
	public static void main(String[] args) {
		String strTst = "ab kind il idn ikba";
		System.out.println("Is this string a palindrome? " + isPalindrome(strTst));
	}
}