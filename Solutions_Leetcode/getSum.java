/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
*/

public class getSum{
	public static int getSum(int a, int b) {
		return (b == 0) ? a : getSum((a^b), (a&b) << 1);
	}
	
	public static void main(String[] args) {
		System.out.println(getSum(-255, -10));
	}
}