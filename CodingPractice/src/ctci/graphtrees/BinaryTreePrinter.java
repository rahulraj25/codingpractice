package ctci.graphtrees;

public class BinaryTreePrinter{
	
	public String traversePreOrder(BinaryTreeNode root) {
	
	    if (root == null) {
	        return "";
	    }
	
	    StringBuilder sb = new StringBuilder();
	    sb.append(root.getData());
	
	    String pointerRight = "|___";
	    String pointerLeft = (root.getRight() != null) ? "|---" : "|___";
	
	    traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
	    traverseNodes(sb, "", pointerRight, root.getRight(), false);
	
	    return sb.toString();
	}
	
	public void traverseNodes(StringBuilder sb, String padding, String pointer, BinaryTreeNode node, 
			  boolean hasRightSibling) {
			    if (node != null) {
			        sb.append("\n");
			        sb.append(padding);
			        sb.append(pointer);
			        sb.append(node.getData());

			        StringBuilder paddingBuilder = new StringBuilder(padding);
			        if (hasRightSibling) {
			            paddingBuilder.append("|  ");
			        } else {
			            paddingBuilder.append("   ");
			        }

			        String paddingForBoth = paddingBuilder.toString();
			        String pointerRight = "|___";
			        String pointerLeft = (node.getRight() != null) ? "|---" : "|___";

			        traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
			        traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
			    }
			}
}

