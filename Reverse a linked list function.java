
        
  static SinglyLinkedListNode reverse(SinglyLinkedListNode head)  {
        while(head ==null || head.next==null)
        {
            return head;
        }
SinglyLinkedListNode current_value = head;
SinglyLinkedListNode prev = null;
SinglyLinkedListNode next = null;

while(current_value != null)
{ 
    next = current_value.next;
    current_value.next = prev;
    prev = current_value;
    current_value = next;
}

return prev;

    }
