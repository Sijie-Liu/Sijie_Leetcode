package DFS;

import DFS.MaximumDepthofBinaryTree.TreeNode;

public class MinimumDepthofBinaryTree {

	public int minDepth(TreeNode root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		if (root.left == null && root.right != null)
			return 1 + minDepth(root.right);

		if (root.left != null && root.right == null)
			return 1 + minDepth(root.left);

		int left = 1 + minDepth(root.left);
		int right = 1 + minDepth(root.right);

		return Math.min(left, right);
	}
}
