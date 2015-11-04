/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/

public class removeElement{
	
	public int removeElement(int[] nums, int val) {
		int i = 0, j = 0;
		for(j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i += 1;
			} 
		}

        return i;
    }	
	public static void main(String[] args) {

	}
}