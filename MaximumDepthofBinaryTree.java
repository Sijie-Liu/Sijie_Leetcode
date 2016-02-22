package DFS;

import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class MaximumDepthofBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// without recursion
	public int maxDepth(TreeNode root) {

		int result = 0;
		Stack<TreeNode> stack = new Stack<MaximumDepthofBinaryTree.TreeNode>();
		if(root == null)
			return 0;
		
		root.val = ++result;
		stack.push(root);
		
		while(stack.isEmpty() == false)
		{
			TreeNode node = stack.pop();
			result = result > node.val?result:node.val;
			
			if(node.left!=null)
			{
				node.left.val = node.val+1;
				stack.push(node.left);
			}
			
			if(node.right!=null)
			{
				node.right.val = node.val+1;
				stack.push(node.right);
			}
		}
		
		return result;
	}
	
	
	
	
	// using recursion
//	public int maxDepth(TreeNode root) {
//
//		if(root == null)
//			return 0;
//		
//		int left_depth = maxDepth(root.left)+1;
//		int right_depth = maxDepth(root.right)+1;
//		
//		return Math.max(left_depth, right_depth);
//	}
}
