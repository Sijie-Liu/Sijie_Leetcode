//package Tree;
//
//public class Manipulations {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//	public Node createTree()
//	{
//		Node root = new Node();
//		root.value=15;
//		Node node1 = new Node();
//		node1.value=6;
//		Node node2 = new Node();
//		node2.value=18;
//		root.left = node1;
//		root.right = node2;
//		return root;
//	}
//	public Node searchByRecursion(Node root, int key)
//	{
//		if(key == root.value)
//			return root;
//		if(root.value>key)
//		{
//			return searchByRecursion(root.left, key);
//			
//		}
//		else {
//			return searchByRecursion(root.right, key);
//		}
//		
//		
//	}
//	
//
//}
