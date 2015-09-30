/* Given a column title as appear in an Excel sheet, 
 * return its corresponding column number.

 * For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/
import java.lang.Integer;

public class ExcelColumnNumber {
	public static int titleToNumber(String s) {
		String S = s.toUpperCase(); 
		int coN = 0;
		int i = S.length() - 1;
		for (; i >= 0; i--) {
			int d = S.length() - 1 - i;
			char e = S.charAt(i);
			coN += (e - 'A' + 1) * (int) Math.pow(26, d);
		} // close for
		
		return coN;      
    }

    public static void main(String[] args) {
    	String test = "ab";
    	int n = titleToNumber(test);
    	System.out.println(n);
    }
}