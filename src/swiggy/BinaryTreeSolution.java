package swiggy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BinaryTreeSolution {

	static boolean[] error = new boolean[4];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Map<Character, List<Character>> tree = new HashMap<Character, List<Character>>();
		int vertex = 0;

		for (int i = 0; i < str.length(); i++) {
			i++;
			char from = str.charAt(i);
			i = i + 2;
			char to = str.charAt(i);
			i++;

			if (tree.containsKey(from)) {
				if (tree.get(from).contains(to))
					error[1] = true;
				else {
					tree.get(from).add(to);
					vertex++;
				}
			} else {
				List<Character> temp = new ArrayList<Character>();
				temp.add(to);
				tree.put(from, temp);
				vertex += 2;

			}
		}
		int connected = 0;

		boolean[] visited = new boolean[vertex];
		StringBuilder result = new StringBuilder();
		for (Map.Entry<Character, List<Character>> next : tree.entrySet()) {

			if (next.getValue().size() > 2)
				error[0] = true;

			if (!visited[next.getKey() - 65]) {
				connected++;
				result.append('(');
				doDfs(tree, next.getKey(), visited, result);
				result.append(')');

			}
		}

		if (connected > 1)
			error[3] = true;

		int index = -1;
		for (int i = 0; i < 4; i++) {
			if (error[i])
				index = i;
		}
		if (index != -1)
			System.out.println("E" + (index + 1));
		else
			System.out.println(result);
		// System.out.println(error);
	}

	private static void doDfs(Map<Character, List<Character>> tree,
			Character key, boolean[] visited, StringBuilder result) {

		visited[key - 65] = true;
		result.append(key);
		if (tree.containsKey(key)) {
			for (Character c : tree.get(key))
				if (!visited[c - 65]) {
					result.append('(');
					doDfs(tree, c, visited, result);
					result.append(')');
				} else
					error[2] = true;

		}

	}
}
