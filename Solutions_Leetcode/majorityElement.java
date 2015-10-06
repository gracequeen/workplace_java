$/* Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
import java.util.Hashtable;
public class majorityElement {

	// Boyer-Moore majority vote algorithm
	public static int majorityElement(int[] nums) {
        
        int cnt = 0; // count the element appearance
        int candidate = 0; // major element
        for (int i = 0; i < nums.length; i++) {
        	if (cnt == 0) {
        		candidate = nums[i];
        		cnt += 1;
        	} else {
        		if (nums[i] == candidate) {
        			cnt += 1;
        		} else {
        			cnt -= 1;
        		}
        	}
        }
        
        return candidate;
        
    }

    // Hashtable stores the occurence frequency
    public static int majorityElement2(int[] nums) {
    	if (nums.length < 2) 
    		return nums[0];
    	Hashtable<Integer, Integer> eOccur = new Hashtable<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (eOccur.containsKey(nums[i])) {
    			eOccur.put(nums[i], eOccur.get(nums[i]) + 1);
    			if (eOccur.get(nums[i]) > (nums.length) / 2) return nums[i];
    		}
    		else eOccur.put(nums[i], 1);
    	}
    	return 0;
    }

    public static void main(String[] args) {
    	
    }

}