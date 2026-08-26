/* structure of link list node
class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
*/
class Solution {
	public boolean isEven(Node head) {
		int len = 0;
		
		if (head == null)
			return true;
		
		while (head != null) {
			len++;
			head = head.next;
		}
		
		if (len%2 == 0)
			return true;
		
		return false;
	}
}
