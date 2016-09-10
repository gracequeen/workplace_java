import java.util.ArrayList;
/*
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
Each element in the result must be unique.
The result can be in any order.
 */
public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) return null;

		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			int e1 = nums1[i];
			for (int j = 0; j < nums2.length; j++) {
				int e2 = nums2[j];
				if ((e1 == e2) && (!res.contains(e1))) {res.add(e1);}
			}
		}
		int[] resArray = new int[res.size()];
		return (resArray);
	}

	public static void main(String[] args) {
	    	
	    }    
    
}