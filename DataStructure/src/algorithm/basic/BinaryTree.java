package algorithm.basic;

public class BinaryTree {

	public static void main(String[] args) {
		int num = 15;
		Tree nodes[] = new Tree[num+1];
		
		for (int i = 1; i < nodes.length; i++) {
			Tree node = new Tree(i);
			node.left = null;
			node.right = null;
			nodes[i] = node;
		}

		for (int i = 2; i < nodes.length; i++){
			if(i % 2 == 0){
				nodes[i/2].left = nodes[i];
			}
			else{
				nodes[i/2].right = nodes[i];
			}
		}
		
		preOrder(nodes[1]);
		System.out.println();
		inOrder(nodes[1]);
		System.out.println();
		postOrder(nodes[1]);
	}
	
	// 전위순회
	static void preOrder(Tree tree){
		if(tree == null) return;
		System.out.print(tree.data + " ");
		preOrder(tree.left);
		preOrder(tree.right);
	}
	
	// 중위순회
	static void inOrder(Tree tree){
		if(tree == null) return;
		inOrder(tree.left);
		System.out.print(tree.data + " ");
		inOrder(tree.right);
	}
	
	// 전위순회
	static void postOrder(Tree tree){
		if(tree == null) return;
		postOrder(tree.left);
		postOrder(tree.right);
		System.out.print(tree.data + " ");
	}

}

class Tree {
	int data;
	Tree left, right;
	public Tree(int data) {
		this.data = data;
	}
	
}
