//package Tree;
//
//import java.util.ArrayList;
//
//public class SymmetricTree {
//	
//	public ArrayList<Integer> list1 = new ArrayList<Integer>();
//	public ArrayList<Integer> list2 = new ArrayList<Integer>();
//	
//	public boolean isSymmetric(TreeNode root) {
//		if(root == null ||(root.left==null&&root.right==null))
//			return true;
//		if(root.left!=null && root.right!=null)
//			return compare(root.left, root.right);
//		else return false;
//	}
//	
//	public boolean compare(TreeNode root1, TreeNode root2)
//	{
//		if(root1.val!=root2.val)
//			return false;
//		else if(root1.val == root2.val && root1.left==null && root1.right==null && root2.left==null && root2.right == null)
//			return true;
//		else if(root1.left==null && root2.right == null && root1.right!=null && root2.left != null)
//			return compare(root1.right, root2.left);
//		else if(root1.right==null && root2.left == null && root1.left!=null && root2.right != null)
//			return compare(root1.left, root2.right);
//		else if(root1.right!=null && root2.left != null && root1.left!=null && root2.right != null)
//			return (compare(root1.left, root2.right) && compare(root1.right, root2.left));
//		else {
//			return false;
//		}
//		
//	}
//}
