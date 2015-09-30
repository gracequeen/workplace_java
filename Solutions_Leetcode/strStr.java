
/*
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Update (2014-11-02):
 * The signature of the function had been updated to return the index instead of the pointer. 
*/
public class strStr {
	public static int strStr(String hay, String nee) {
		if ((hay == "") || (nee == "")) {
		    return -1;
		}
		for (int i = 0; i <= hay.length() - nee.length(); i++) {
			if (hay.substring(i, i + nee.length()).equals(nee)) {
				return i;
			}
		} // close for
		return -1;
	} // close strStr method
	public static void main(String[] args) {

		System.out.println(strStr("baabbbbababbbabab", "abbab"));
		System.out.println(strStr("ab", "abbbb"));
		System.out.println(strStr("less is more", "re"));
		System.out.println(strStr("", ""));

	}
}