import static org.junit.Assert.*;

import org.junit.Test;

public class LCAtest {

	@Test
	public void testLCA() {
		LCA tree = new LCA();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(19);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(17);
		tree.root.right.right = new Node(21);

		assertEquals("LCA(1, 6) is 5", 5, tree.findLCA(tree.root, 1, 6));
		assertEquals("LCA(17, 21) is 19", 19, tree.findLCA(tree.root, 17, 21));
		assertEquals("LCA(1, 21) is 10 ", 10, tree.findLCA(tree.root, 1, 21));
		assertEquals("LCA(17, 19) is ", 19, tree.findLCA(tree.root, 17, 19));
		assertEquals("LCA(4, 19) is -1 because 4 is not a root ", -1, tree.findLCA(tree.root, 4, 19));
	}

	@Test
	public void testFindPath() {
		LCA tree1 = new LCA();
		tree1.root = null;
		assertEquals("LCA(1, 6) is 5", -1, tree1.findLCA(tree1.root, 1, 6));
	}

}
