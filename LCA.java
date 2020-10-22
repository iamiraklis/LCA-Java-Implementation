
//implementation from Geeks for Geeks
import java.util.ArrayList;
import java.util.List;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LCA {

	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	boolean findPath(Node root, int n, List<Integer> path) {
		if (root == null) {
			return false;
		}

		path.add(root.data);

		if (root.data == n) {
			return true;
		}

		if ((root.left != null && findPath(root.left, n, path))
				|| (root.right != null && findPath(root.right, n, path))) {
			return true;
		}

		path.remove(path.size() - 1);

		return false;
	}

	int findLCA(Node root, int n1, int n2) {
		path1.clear();
		path2.clear();

		if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
			return -1;
		}


int i=0;
while (i<path1.size() && i < path2.size()){
			if (!path1.get(i).equals(path2.get(i)))
				break;
				i+=1;
		}
		
		return path1.get(i - 1);
	}

}
