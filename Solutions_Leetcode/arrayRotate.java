/* Rotate an array of n elements to the right by k steps.

 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

 */

 public class arrayRotate {

 	public static void rev(int[] nums2, int start, int end) {
 		while (start < end) {
 			int tmp = nums2[end];
 			nums2[end] = nums2[start];
 			nums2[start] = tmp;
 			start += 1;
 			end -= 1;
 		}
 	}

 	public static void rotate(int[] nums, int k) {
 		 k = k % nums.length;
        if (k <= 0) {
            return;
        }
    	rev(nums, 0, nums.length - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, nums.length - 1);
    }        

    public static void arrayPrint(int[] num) {
    	for (int i = 0; i < num.length; i++) {
    		System.out.print(num[i] + ",");
    	}
    	System.out.print("\n");
    }

    public static void main(String[] args) {
    	int[] testArray = {1, 2, 3};
    	arrayPrint(testArray);
    	rotate(testArray, 4);
    	arrayPrint(testArray);
    }
 }
    