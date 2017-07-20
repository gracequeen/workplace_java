import java.util.*;
/*
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
Each element in the result must be unique.
The result can be in any order.
 */
public class intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) return null;
		Set<Integer> array = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			array.add(nums1[i]);
		}

		for (int j = 0; j < nums2.length; j++) {
			if (array.contains(nums2[j])) {
				common.add(nums2[j]);
			}
		}

		int[] result = new int[common.size()];
		int k = 0;
		for (int integer : common) {
			result[k] = integer;
			k += 1;
		}
		return result;

		
		
	}

	public static int[] findCommon (int[] s, int[] l) {
		Set<Integer> sArray = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();

		for (int i = 0; i < s.length; i++) {
			sArray.add(s[i]);
		}

		for (int j = 0; j < l.length; j++) {
			if (sArray.contains(l[j])) {
				common.add(l[j]);
			}
		}

		int[] result = new int[common.size()];
		int k = 0;
		for (int integer : common) {
			result[k] = integer;
			k += 1;
		}
		return result;


	}

	public static void main(String[] args) {
	    	
		int[] a = {1, 2, 2, 15, 3};
		int[] b = {2, 5, 7, 15, 1};
		int[] res = intersection(a, b);
		for (int i = 0; i < res.length; i++) {
			System.out.print(" " + res[i]);
		}
	}    
    
}