package DFS;

import DFS.MaximumDepthofBinaryTree.TreeNode;

public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {

		if (root == null)
			return true;

		return unitBalance(root) && isBalanced(root.left)
				&& isBalanced(root.right);

	}

	public boolean unitBalance(TreeNode root) {
		if (root == null)
			return true;

		int left = depth(root.left);
		int right = depth(root.right);
		if (Math.abs(left - right) <= 1)
			return true;
		else {
			return false;
		}
	}

	public int depth(TreeNode root) {
		if (root == null)
			return 0;

		int left = depth(root.left) + 1;
		int right = depth(root.right) + 1;

		return Math.max(left, right);
	}
}
