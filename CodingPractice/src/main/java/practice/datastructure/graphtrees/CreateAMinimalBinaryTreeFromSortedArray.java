package practice.datastructure.graphtrees;

public class CreateAMinimalBinaryTreeFromSortedArray {
	
	public static void main(String[] args) {
		
		int[] sortedArr = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		BinaryTreeNode minimalTree = createMinimalTree(sortedArr,0,sortedArr.length-1);
		printTree(minimalTree);
		System.out.println();
		System.out.println(new BinaryTreePrinter().traversePreOrder(minimalTree));
	}

	private static void printTree(BinaryTreeNode node) {
		if(node == null)
			return;
		
		printTree(node.left);
		System.out.print(node.data + " ");
		printTree(node.right);
		
	}

	private static BinaryTreeNode createMinimalTree(int[] sortedArr, int start, int end) {
		if(end < start)
			return null;
		
		int mid = (start + end)/2;
		BinaryTreeNode node = new BinaryTreeNode();
		node.data = sortedArr[mid];
		node.left = createMinimalTree(sortedArr, start, mid-1);
		node.right = createMinimalTree(sortedArr, mid + 1, end);
		
		return node;
	}
	

}
