package eddy;

import java.util.*;



public class postorderTraversal {

	List<Integer> ll = new ArrayList<Integer>();
	public List<Integer> postorderTraversal(TreeNode root) {
		if(root!=null){
			if(root.left!=null) postorderTraversal(root.left);
			ll.add(root.val);
			if(root.right!=null) postorderTraversal(root.right);
		}
		return ll;
	}
}
