
static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
DoublyLinkedListNode newnode = new DoublyLinkedListNode(data);
if(head == null)
{
    head = newnode;
}

DoublyLinkedListNode i = head;

if(head.data>newnode.data)
{
    newnode.next=head;
    head.prev=newnode;
    newnode.prev=null;
    head=newnode;
}
else
{
    while(i.next!=null && i.next.data<newnode.data)
    {
        i = i.next;
    }
    newnode.next = i.next;
    i.next = newnode;
    newnode.prev=i;
    i.next.prev = newnode;
}

return head;
    }

