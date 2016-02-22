package Tree;

public class KthSmallest {

	public static int value;
	public static int count=0;
	
	public int kthSmallest(TreeNode root, int k) {
        search(root, k);
        return value;
    }
	
	public void search(TreeNode root, int k)
	{
		if(root.left!=null)
		{
			search(root.left, k);
		}
		{
			count++;
			if(count==k)
			 {
				 value = root.val;
				 return;
			 }
		}
		if(root.right!=null)
		{
			search(root.right, k);
		}
			 
	}
}
