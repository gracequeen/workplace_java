/* You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can 
 * you climb to the top?
*/

public class climbStairs{
	public static int climbStairs(int n) {
		int cnt = 0;
		int fn1 = 1;
		int fn2 = 2;
		if (n == 1) {
			cnt = fn1;
		} else if (n == 2) {
			cnt = fn2;
		} else {
			for (int i = 3; i <= n; i++) {
				cnt = fn1 + fn2;
				fn1 = fn2;
				fn2 = cnt;
			}
		} // close if-else
		return cnt;
	} // close climbStairs method

	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
}