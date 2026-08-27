/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        if(head==null || x<0){
            return head;
        }
        
        
        if(x==1){
            head=head.next;
            return head;
        }
        else{
            Node prev=head;
            int count=1;
            while(count<x-1){
                prev=prev.next;
                count++;
            }
            Node current=prev.next;
            prev.next=current.next;
        }
        return head;
    }
}