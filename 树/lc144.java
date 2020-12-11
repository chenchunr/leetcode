 //非递归方式
    public List<Integer> preorderTraversal(TreeNode root) {
         Stack<TreeNode>stack=new Stack<>();
		 List<Integer>res=new ArrayList<Integer>();
		 if(root==null)return res;
		 stack.push(root);
		 while(!stack.isEmpty()){
			 TreeNode treeNode=stack.pop();
			 res.add(treeNode.val);
			 if(treeNode.right!=null)stack.push(treeNode.right);
			 if(treeNode.left!=null)stack.push(treeNode.left);
			 
		 }
		 return res;
        
    }