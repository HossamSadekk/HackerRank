  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
SinglyLinkedListNode i =head;
SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
if(head == null)
{
    head = new SinglyLinkedListNode(data);
}
else
{
while(i.next != null)
{
    i=i.next;
}
i.next=newnode;
}

return head;

    }