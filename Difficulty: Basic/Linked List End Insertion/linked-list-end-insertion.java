/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode=new Node(x);
        //if head is null
        if(head==null){
            head=newNode;
            return newNode;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
        
        return head;
    }
}