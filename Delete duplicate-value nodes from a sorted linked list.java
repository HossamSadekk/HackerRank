static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
if(head==null){return head;}

SinglyLinkedListNode i = head;

while(i.next != null)
{
    if(i.data==i.next.data)
    {
        i.next = i.next.next;
    }
    else
    {
        i = i.next;
    }
}
       return head;
    }
