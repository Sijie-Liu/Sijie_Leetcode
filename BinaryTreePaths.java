package DFS;

import java.util.ArrayList;
import java.util.List;

import DFS.MaximumDepthofBinaryTree.TreeNode;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root == null)
        	return result;
        if(root.left == null && root.right == null)
        {
            result.add(String.valueOf(root.val));
            return result;
        }
        getResults(root.left, result, String.valueOf(root.val));
        getResults(root.right, result, String.valueOf(root.val));
        return result;
    }
	
	public void getResults(TreeNode root, List<String> result, String currentStr)
	{
		if(root == null)
			return;
		if(root.left == null && root.right == null)
		{
			String finalStr = currentStr + "->" + String.valueOf(root.val);
			result.add(finalStr);
		}
		
		if(root.left !=null)
		{
			String nextString = currentStr +"->"+String.valueOf(root.val);
			getResults(root.left, result, nextString);
		}
		
		if(root.right != null)
		{
			String nextString = currentStr +"->"+String.valueOf(root.val);
			getResults(root.right, result, nextString);
		}
	}
}
