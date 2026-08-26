/*
class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	public ArrayList<Integer> printList(Node head) {
		ArrayList<Integer> list = new ArrayList<>();
		
		if (head == null) {
			return list;
		} else {
			Node temp = head;
			
			while (temp != null) {
				list.add(temp.data);
				temp = temp.next;
			}
		}
		
		return list;
	}
}
