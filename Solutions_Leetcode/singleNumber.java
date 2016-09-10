/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

*/

public class singleNumber{

	public static int singleNumber(int[] nums) {
		if(nums.length == 0) return nums[0];
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}	
	public static void main(String[] args) {
		int[] a = new int[]{1, 1, 2, 2, 3, 4, 4};
		System.out.println(singleNumber(a));
	}
}