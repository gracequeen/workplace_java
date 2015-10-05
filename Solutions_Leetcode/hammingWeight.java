
/*
Write a function that takes an unsigned integer and returns the number of ’1' bits it has 
(also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, 
so the function should return 3.
*/

public class hammingWeight {

	// n is unsigned
	public static int hammingWeight(int n) {
		int cnt = 0;
		String s = Integer.toBinaryString(n);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				cnt += 1;
			} 
		}
        return cnt;
    }

    public static int hammingWeight1(int n) {
        int cnt = 0;
		if (n == 0) {return 0;}
        while (n != 0) {
            if ((n&1) == 1) {
                cnt += 1;
            }
            n >>>= 1;
        }		
        return cnt;
    }

    public static void main(String[] args) {
    	int nWeight = hammingWeight(15);
    	System.out.println(nWeight);
    	String x = Integer.toBinaryString(15);
    	System.out.println(x);
    	int nWeight1 = hammingWeight1(2);
    	System.out.println(nWeight1);
    }
}