package buildBinaryTree;
import java.util.*;

public class Node{
		public int data;
		public Node left;
		public Node right;
		
		//ctor
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
		//buildTree
	public	static Node buildTree(Node root) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("\nEnter the data: ");
	        int data = sc.nextInt();

	        if (data == -1) {
	            return null;
	        }

	        root = new Node(data);

	        System.out.print("Enter data for inserting in left of " + data);
	        root.left = buildTree(root.left);

	        System.out.print("Enter data for inserting in right of " + data);
	        root.right = buildTree(root.right);

	        return root;
	    }
		
		//levelOrderTraversal
	 public static void levelOrderTraversal(Node root) {
			Queue<Node> q=new LinkedList<Node>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node temp=q.peek();
				q.remove();
				
				if(temp==null) {
					System.out.println();
					if(!q.isEmpty()) {
						q.add(null);
					}
				}
				else {
					System.out.print(temp.data+" ");
					if(temp.left!=null) {
						q.add(temp.left);
					}
					if(temp.right!=null) {
						q.add(temp.right);
					}
				}
			}
		}
	 
	 public static void inorder(Node root) {
		 if(root==null)
			 return;
		 
		 inorder(root.left);
		 System.out.print(root.data+" ");
		 inorder(root.right); 
	 }
	 
	 public static void preorder(Node root) {
		 if(root==null)
			 return;
		 
		 System.out.print(root.data+" ");
		 preorder(root.left);
		 preorder(root.right); 
	 }
	 
	 public static void postorder(Node root) {
		 if(root==null)
			 return;
		 
		 postorder(root.left);
		 postorder(root.right); 
		 System.out.print(root.data+" ");
	 }
	
	public static void main(String[] args) {
		Node root=null;
		root=buildTree(root);
		//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1 
		System.out.println("\nlevelOrderTraversal traversal");
		levelOrderTraversal(root);
		
		System.out.println("\ninorder traversal");
		inorder(root);
		
		System.out.println("\npreorder traversal");
		preorder(root);
		
		System.out.println("\npostorder traversal");
		postorder(root);
	}


}
