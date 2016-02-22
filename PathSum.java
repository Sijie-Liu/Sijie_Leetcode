//package Tree;
//
//public class PathSum {
//
//	
//	
//	public  boolean hasPathSum(TreeNode root, int sum) {
//        return search(root, sum);
//    }
//	
//	public boolean search(TreeNode root, int sum)
//	{
//		
//		if(root==null)
//			return false;
//		if(root.left == null && root.right==null)
//			return sum==root.val;
//		
//		return (search(root.left, sum-root.val)||search(root.right, sum-root.val));
//		
//	}
//	
//	
//}
