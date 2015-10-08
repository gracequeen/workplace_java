/*
Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
*/

public class containsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		if (nums.length <= 1) {return false;}
        HashSet s = new HashSet();
        for (int i : nums) {
        	if (s.contains(i)) {
        		return true;
        	} else {
        		s.add(i);
        	}
        }
        return false;
    }
    
}