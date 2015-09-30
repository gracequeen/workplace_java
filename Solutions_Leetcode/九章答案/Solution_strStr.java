public class Solution_strStr {
	public static int strStr(String source, String target) {
		if ((source == null) || (target == null)) {
			return -1;
		}

		int i, j;
		for (i = 0; i < source.length() - target.length() + 1; i++) {
			for (j = 0; j < target.length(); j++) {
				if (source.charAt(i + j) != target.charAt(j)) {
					break;
				} // if
			} // for j
			if (j == target.length()) {
				return i;
			}
		} // for i
		return -1;
	}

	public static void main(String[] args) {
		String needle = "hij";
		String haystack = "hkkllhijlll";
		int s = strStr(haystack, needle);
		System.out.println(s);
	}
}