static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
if(head==null || head.next==null)
{
    return head;
}
else
{
    DoublyLinkedListNode current = head;
    DoublyLinkedListNode previous = null;

    while(current!=null)
    {
        DoublyLinkedListNode next = current.next;
        current.prev = next;
        current.next = previous;
        previous = current;
        current = next;
    }
head = previous;
return head;
  

}
    }