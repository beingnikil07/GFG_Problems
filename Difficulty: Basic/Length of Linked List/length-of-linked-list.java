/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        
        if(head==null){
            return 0;
        }
        
        int len=0;
        
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}