/* Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
*/
public class reverseInt {
	public static int reverse(int x) {		
		int y = 0;
		String yStr = "";
		boolean neg = false;
		if (x < 0) {
			neg = true;
			x = -x;
		}
		String xStr = Integer.toString(x);
		int xLen = xStr.length();
		if (xStr.charAt(xLen - 1) != '0') {
			yStr += xStr.charAt(xLen - 1);
		} 
		
		for (int i = 1; i < xLen; i++) {
			yStr += xStr.charAt(xLen - 1 - i);
		} // close for
		try{
    		y =Integer.parseInt(yStr);
    	} catch(NumberFormatException e){
        	return 0;
		}
		if (neg) {
			y = -y;
		}
		return y;
	} // close reverse method
	public static void main(String[] args) {
		System.out.println(reverse(231));
		System.out.println(reverse(2310));
		System.out.println(reverse(1000));
		System.out.println(reverse(-213648));
		System.out.println(reverse(-1000000008));

	}
}
