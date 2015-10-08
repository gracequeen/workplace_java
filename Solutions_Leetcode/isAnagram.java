/* Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/
import java.util.Hashtable;
import java.util.Arrays;

public class isAnagram{
	
	// Idea 0: Hashtable
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {return false;}

		// Setup Hashtable for string s, <letter, letter #>
		Hashtable<Character, Integer> stable = new Hashtable<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			if(stable.containsKey(s.charAt(i))) {
				stable.put(s.charAt(i), stable.get(s.charAt(i)) + 1);
			} else {
				stable.put(s.charAt(i), 1);
			}
		} // close for loop

		// Setup Hashtable for string t, <letter, letter #>
		Hashtable<Character, Integer> ttable = new Hashtable<Character, Integer>();
		for(int i = 0; i < t.length(); i++) {
			if(ttable.containsKey(t.charAt(i))) {
				ttable.put(t.charAt(i), ttable.get(t.charAt(i)) + 1);
			} else {
				ttable.put(t.charAt(i), 1);
			}
		} // close for loop

		return stable.equals(ttable);
    }

    // Idea 1: Array sort
    public boolean isAnagram1(String s, String t) {
    	if (s.length() != t.length()) {return false;}

    	// turning both strings into char arrays
    	char[] aS = s.toCharArray();
    	char[] aT = t.toCharArray();

    	// sorting arrays
    	Arrays.sort(aS);
    	Arrays.sort(aT);

    	// compare the sorted results 
    	return Arrays.equals(aS, aT);
    }
}

