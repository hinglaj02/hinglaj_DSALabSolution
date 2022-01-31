package greatlearning;

import java.util.ArrayList;

public class findLongestPath {

	static class Node{
		Node leftNode;
		Node rightNode;
		int nodeData;
	};
public static Node newNode(int nodeData)
{
	Node temp = new Node();
	temp.nodeData = nodeData;
	temp.leftNode = null;
	temp.rightNode = null;
	return temp;
}
private static ArrayList<Integer> findLongestPath(Node root) {
	
	
	// if root is null means there is no btree so return a empty vector
	if(root == null)
	{
		ArrayList<Integer> output = new ArrayList<>();
	return output;
	}
	
	//Recursive call on root.rightnode
	ArrayList<Integer> rightArray =  findLongestPath(root.rightNode);
	
	//Recursive call on root.leftnode
	ArrayList<Integer> leftArray =  findLongestPath(root.leftNode);
	
	// Compare the size of the two Arraylist
	// and insert current node acc.
	
	if(rightArray.size() < leftArray.size()) {
		leftArray.add(root.nodeData);
	}else
	{
		rightArray.add(root.nodeData);
	}
	return(leftArray.size()> rightArray.size() ? leftArray : rightArray);
}
// Driver code
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
Node root = newNode(100);
root.leftNode = newNode(20);
root.rightNode = newNode(130);
root.leftNode.leftNode = newNode(10);
root.leftNode.rightNode = newNode(50);

root.rightNode.leftNode = newNode(110);
root.rightNode.rightNode = newNode(140);
root.leftNode.leftNode.leftNode = newNode(5);
ArrayList<Integer> output =  findLongestPath(root);
int size = output.size();

System.out.println(output.get(size-1));
for(int i = size-2; i>=0; i--)
{
System.out.println(" -->" + output.get(i));
}



	
}
}



