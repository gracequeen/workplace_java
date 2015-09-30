import java.util.*;

public class subsets {
	/* subsets:
	 * Idea from Jiuzhang
	 * generating as the DFS in Graph Search
	 * use DFS as the helper
	 */
	public static List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (S == null) {
			return ret;
		}
		Arrays.sort(S);
		dfs(S, 0, new ArrayList<Integer> (), ret);
		return ret;
	} // close subsets

	public static void dfs(int[] S, int index, List<Integer> path, List<List<Integer>> ret) {
		ret.add(new ArrayList<Integer>(path));

		for(int i = index; i < S.length; i++) {
			path.add(S[i]);
			dfs(S, i + 1, path, ret);
			path.remove(path.size() - 1);
		} // close for
	} // close dfs

	/* subsets1:
	 * also the idea of DFS
	 * my own edition 
	 */
	
	public static void main(String[] args) {
		int[] S = {1, 2, 3};
      List<List<Integer>> alist = subsets(S);
      for (int k = 0; k < alist.size(); k++) {
      	List<Integer> aElement = alist.get(k);
      	System.out.print("[");
      	for (int m = 0; m < aElement.size(); m++) {
      		int e = aElement.get(m);
      		System.out.print(e + " ");
      	} // close m for
      	System.out.print("], ");


      } // close k for

	}
}