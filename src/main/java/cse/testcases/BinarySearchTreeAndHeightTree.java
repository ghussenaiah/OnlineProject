package cse.testcases;

public class BinarySearchTreeAndHeightTree {
	
	

	public static void main(String args[])
	{
		
		BNodeOperation bnp=new BNodeOperation();
		bnp.add(new BNode(100));
		bnp.add(new BNode(80));
		bnp.add(new BNode(120));
		/*bnp.add(new BNode(85));
		bnp.add(new BNode(120));
		bnp.add(new BNode(76));
		bnp.add(new BNode(74));
		bnp.add(new BNode(76));
		bnp.add(new BNode(120));
		bnp.add(new BNode(115));
		bnp.add(new BNode(125));
		bnp.add(new BNode(112));
		bnp.add(new BNode(117));
		bnp.add(new BNode(111));
		bnp.add(new BNode(113));*/
		//bnp.displayData();
		System.out.println("Deletion at end");
		//bnp.delete(100);
		//bnp.displayData();
		bnp.fingHeigthTree();
	}
	

}
class BNode{
	
	public int data;
	public BNode left;
	public BNode right;
	
	BNode(int data)
	{
		this.data=data;
	}
}
class BNodeOperation{
	
	

	public static int height=0;
	
	public BNode root;
	BNodeOperation()
	{
		root=null;
	}
	
	
	public void fingHeigthTree() {
		 BNode current1=root;
	int io=	height(root);
		System.out.println(io);
			
				
		}
	public int height(BNode current1)
	{
		/*if(current1.left!=null)
			if(level>=height)
			height=level;{
		height(current1.left,level++);}
		if(current1.right!=null)
			if(level>=height)
				height=level;{
		height(current1.right,level++);}*/
		
		
	        if (current1 == null)
	           return 0;
	        else
	        {
	            /* compute  height of each subtree */
	            int lheight = height(current1.left);
	            int rheight = height(current1.right);
	             
	            /* use the larger one */
	            if (lheight > rheight)
	                return(lheight+1);
	            else return(rheight+1); 
	        }
	    
		
		
		}
	
	public void add(BNode bnode){
		
		//BNode actualroot=root;
		insert(root,bnode);
	}
	public void delete(int node){
		
		//BNode actualroot=root;
		root=delete(root,node);
	}
	@SuppressWarnings("unused")
	public BNode delete(BNode root1,int current)
	{
		if(root1.data > current)
		{
			
			if(root1.left!=null){
				root1.left=delete(root1.left,current);
			
				}
			
		}
		else if(root1.data < current)
		{
			
			if(root1.right!=null){
				root1.right=delete(root1.right,current);
				
				}
			
			//when we place recursion call after recursion call statements pushed to stack
			//start execution when some condition fails in before recursion call
			//if recursion call contains one or more return statements it wont to 
			//come out of that loop if something in middle retuns true
		}
		else
		{
			if(root1.right==null)
				return root1.left;
			else if(root1.left==null)
				return root1.right;
			
			BNode leftTree = root1.left;
			BNode rightTree = root1.right;
			
			root1= findSuccessor(root1.right);
			root1.right=removeActualNode(rightTree);
			root1.left=leftTree;
			
			
			
			
		}
		return root1;
		
		
	}
	public BNode removeActualNode(BNode root1){
		
		if(root1.left!=null){
	root1.left=removeActualNode(root1.left);
		//root1=root1;
		}
		else
		{
			return root1.right;
		}
		return root1;
		
	}
	public BNode findSuccessor(BNode root1)
	{
		while(root1.left!=null)
			root1=root1.left;
		
		return root1;
		
	}
	
	public void insert(BNode root1,BNode current)
	{
		/*if(flag==true){
		
		flag=false;
		}*/
		root=root1;
		if(root==null)
		{
			root=current;
		}
		else if(root.data>=current.data)
		{
			if(root.left!=null){
				insert(root.left,current);
				//root1.right=root.right;
				root=root1;              //we need make eveynode node as root at forward direction after adding element we
				//again in backword direction we need to make parent node as root node 
				}
				
				if(root.left==null){
					root1.left=current;           //here root1 is just referenece but not actual tree node just for attaching new node to reference
					//root=root1;                  //we add to root that complete node joied to actual node
				}
				
		}
		else if(root.data<current.data)
		{

			if(root.right!=null){
			insert(root.right,current);
			//root1.right=root.right;
			root=root1;
			}
			
			if(root.right==null){
				root1.right=current;
				//root=root1;
			}
			
		}
	}
	public void displayData()
	{
		BNode current=root;
		printData(current);
	}
	public void printData(BNode current)
	{
		
		 if(current!=null){
		 printData(current.left);
		 System.out.println(current.data);
		 printData(current.right);
		
		 }
		 
		
	}
}

