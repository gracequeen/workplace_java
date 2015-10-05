/* Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 * For example:

 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

public class addDigits{
	public static int addDigits(int num) {
        while(num>9) num = num/10+num%10;
		return num;

	}

	public static void main(String[] args) {
		int x = 9999%1000;
		int y = addDigits(9999);
		System.out.println(x);
		System.out.println(y);
	}

}
